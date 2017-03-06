//package com.dermot.oogame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * The "World".
 * Contains the objects in our world (composition), an update method (where things move), and a draw method to "render" our world.
 * @author dermot.hegarty <- Change this in each file to your own name.
 *
 */
public class World
{
	//I've implemented it as 6*6 grid but can change the size via these constants.
	public static final int WORLD_WIDTH = 6;
	public static final int WORLD_HEIGHT = 6;

	/*Note: could have implemented these as an "enum" but we haven't seen this yet (nicer solution)*/
	public static final int NORTH = 0;
	public static final int NORTH_EAST = 1;
	public static final int EAST = 2;
	public static final int SOUTH_EAST = 3;
	public static final int SOUTH = 4;
	public static final int SOUTH_WEST = 5;
	public static final int WEST = 6;
	public static final int NORTH_WEST = 7;
	
	public static final int NUM_DIRECTIONS = 8;

	//The instance fields are the contents of our world
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	private Player player;
	
	/**
	 * 
	 * @param player Player object is created outside the class and passed in
	 * @param noOfEnemies Enemies are created internally
	 */
	public World(Player player, int noOfEnemies)
	{
		this.player = player;
		for(int i = 0; i < noOfEnemies; i++)
		{
			createEnemy(i+1);
		}
	}
	
	private void createEnemy(int enemyNumber)
	{
		Random rand = new Random();
		int xVal = rand.nextInt(WORLD_WIDTH);
		int yVal = rand.nextInt(WORLD_HEIGHT);
		
		enemies.add(new Enemy(enemyNumber, new Location(xVal, yVal)));				
	}
	
	/**
	 * This corresponds to a single frame of our game (a game loop merely calls this in a loop):
	 * Move the Player (via input from the user)
	 * Move the enemies
	 * Enemies will shoot if they are in range of the player.
	 * @param sc this will be the same scanner as used in the Game class (cannot nest them)
	 */
	public void update(Scanner sc)
	{
		//Game loop continues as long as there is something to play, i.e. you're not dead.
		if(player.isAlive())
		{
			
			//Two things happening here - find out the direction that
			//the player and wants to move and attempt to move him (the
			//method returns a boolean but I simply ignore it here).
			player.moveDirection(getPlayerMovementDirection(sc));
			
			
			for(Enemy currEnemy: enemies)
			{
				//Maybe the enemy tried to move in a direction that isn't possible
				if(!currEnemy.move())
				{
					System.out.println("Enemy " + currEnemy.getEnemyNumber() + " can't move this iteration");
				}

				//Note how the inRange method takes a reference to the Player object (so that it can query its location)
				if(currEnemy.inRange(player))
				{
					currEnemy.shootPlayer(player);
					System.out.println("Enemy " + currEnemy.getEnemyNumber() + " shoots Player");
					System.out.println("Player Health down to " + player.getHealth());
				}

			}
		}
	}
	

	/**
	 * Private utility method to ask for user input and return the value (no error/bounds checking)
	 * @param sc the active scanner object
	 * @return value representing one of eight directions.
	 */
	private int getPlayerMovementDirection(Scanner sc)
	{
		System.out.println("Direction to move? 0:NORTH 1:NORTH EAST 2:EAST 3:SOUTH EAST 4:SOUTH 5:SOUTH WEST 6: WEST 7: NORTH WEST");
		
		return sc.nextInt();
		
	}
	
	/**
	 * Draw the grid world with the help of some private helper methods.
	 */
	public void drawWorld()
	{
		drawTopRowLine();
		for(int i = 0; i < WORLD_HEIGHT; i++)
		{
			drawRow(i);
		}
		
	}
	
	private void drawRow(int currRow)
	{
		System.out.print("|");//Row always starts with this
		
		//Loop through the entire row drawing a "cell" each time
		for (int i = 0; i < WORLD_WIDTH; i++)
		{
			drawCell(currRow, i);
		}
		drawBottomRowLine();
	}
	
	private void drawTopRowLine()
	{
		for (int i = 0; i < WORLD_WIDTH * 2 + 1; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}

	private void drawBottomRowLine()
	{
		drawTopRowLine();
	}
	
	/**
	 * Since this is called in a nested loop it effectively draws a single cell.
	 * Note that a cell can contain nothing  - represented by a space - or a combination
	 * of player and enemy characters. 
	 * Player is represented by the letter "P" and enemies are represented by their number.
	 * @param currRow
	 * @param currColumn
	 */
	private void drawCell(int currRow, int currColumn)
	{
		//YOU COMPLETE THIS - NOTE: Until you do, you ccould print the location (using the Location.toString()) to see where the objects are located.
		boolean characterPosition = false; //variable makes sure that I don't also provide a space " " character
		
		//PSEUDO CODE
		//CHECK if the current position is occupied by the player (remember that the Word has a reference to the player object).
		//If it has, print a "P" to show on on-screen
		
		//NOW loop through the enemies and perform a similar check to the above.
		
		//Print a " " only if no game characters were found to occupy the location
		
		//Put in a "|" at the end of the cell
		
		//Check if it is the last cell in the row - if so put in a newline .
		
		
	}

	/**
	 * Other classes will also need to communicate with the player object.
	 * @return reference to the Player object
	 */
	public Player getPlayer()
	{
		return player;
	}
	

}