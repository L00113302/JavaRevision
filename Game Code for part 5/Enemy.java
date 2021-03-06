//package com.dermot.oogame;

import java.util.*;
/**
 * The Enemy class encapsulates the notion of an enemy having
 * a number (for display), a location and a shooting range.
 * The enemy can move can attempt to move in a random direction and 
 * can "shoot" the player if he is in range.
 *  
 * 
 * @author dermot.hegarty
 * @version 1.0
 * 
 */
public class Enemy
{
	private int enemyNumber; //useful to identify the enemy
	private Location location; 
	private double defaultRange = 3.0; //If enemy is <= to this then he will shoot
	
	public Enemy(int enemyNumber, Location location)
	{
		this.enemyNumber = enemyNumber;
		this.location = location;
	}
	
	public int getEnemyNumber()
	{
		return enemyNumber;
	}

	public Location getLocation()
	{
		return this.location;
	}
	/**
	 * Move the enemy in a random direction by one position, if possible
	 * @return whether the move was possible or not.
	 */
	public boolean move()
	{
		Random rand = new Random();
		
		int direction = rand.nextInt(World.NUM_DIRECTIONS);
		return moveDirection(direction); 
		
	}
	
	/**
	 * TO BE COMPLETED
	 * @param directionToMove
	 * @return whether a move was made or not. This may or may not be useful information to the calling code
	 */
	public boolean moveDirection( int directionToMove)
	{
		switch (directionToMove)
		{
			case (World.SOUTH):
				if(location.getY() < World.WORLD_HEIGHT - 1)
				{
					location.changeY(1);
					return true;
				}
				return false; //because of the nature of "return" we don't need an "else" here
            			
			default:
				return false;
				
		}

	}
	

	/**
	 * 
	 * @param player the player's character
	 * @return whether the player is in range of the enemy or not.
	 */
	public boolean inRange(Player player)
	{
		if( computeDistance(player) <= defaultRange)
		{
			return true;
		}	
		else
		{
			return false;
		}
	}
	
	/**
	 * Note how the Player is passed in so the enemy can interact with him (the alternative 
	 * would be for the enemy to have a Player reference as an instance field)
	 * @param player
	 */
	public void shootPlayer(Player player)
	{
		//even though my calling code always checks if the player is in range before shooting I put it in here as a safeguard
		//in case some tries to invoke shootPlayer without first checking whether it's valid to do so.
		if (inRange(player))
		{
			player.takeHit(1);
		}
	}
	
	/**
	 * Computes the distance to the player using Pythagoras. 
	 * Note that the unit distance between "cells" is 1, so the diagonal distance between cells would be 1.41 (square root of 2)
	 * Make an effort to read and understand what is going on here.
	 * @param p
	 * @return the straight-line distance to the player (from the enemy, i.e. "this" object)
	 */
	private double computeDistance(Player p)
	{
		int x1 = this.location.getX();
		int x2 = p.getLocation().getX();
		int deltaX = x1 - x2;
		
		int y1 = this.location.getY();
		int y2 = p.getLocation().getY();
		int deltaY = y1 - y2;
		return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
	}
	
}