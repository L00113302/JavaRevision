//package com.dermot.oogame;

import java.util.Scanner;

/**
 * This basically represents our game loop
 * @author Dermot
 *
 */
public class Game 
{
	public static void main(String[] args)
	{
		World gameWorld = new World(new Player(new Location(0,0)), 3);
		System.out.println("Initial World");
		gameWorld.drawWorld();
		
		Scanner userInput = new Scanner(System.in);
		
		String userChoice;
		
		int iterationCounter = 0; //Keeps track of how long you survive
		
		//GAME LOOP
		do
		{
			//Almost all games boil down to this - update the world and "render" it
			gameWorld.update(userInput);
			gameWorld.drawWorld();
			
			iterationCounter++;
			
			//Slightly nasty to use a break statement but because the logic is so straightforward I can get away with it
			//Alternative could be to use a flag to signal the condition - playerDead - to the while 
			if(!gameWorld.getPlayer().isAlive())
			{
				System.out.println("You're Dead! You lasted " +  iterationCounter + "turns");
				break;
			}
			
			
			System.out.println("Continue y/n");
			userChoice = userInput.nextLine();
			userChoice = userInput.nextLine();
		} while (!userChoice.equalsIgnoreCase("n"));
		
		System.out.println("Bye Bye");
		userInput.close();
	}

}
