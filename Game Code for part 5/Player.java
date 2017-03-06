//package com.dermot.oogame;
/**
 * The Player class represents the player, with its main characteristic being a location
 * and a health indicator.
 * In the game, the user will attempt to move a player in the optimum direction to
 * avoid being shot by enemies.
 * 
 * @author dermot.hegarty
 *
 */
public class Player
{
	private Location location;
	private int health;
	
	public Player(Location location)
	{
		this.health = 5;
		this.location = location;
	}

	public void takeHit(int healthHit)
	{
		health -= healthHit;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public boolean isAlive()
	{
		return (health > 0);
	}
	
	public Location getLocation()
	{
		return location;
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
				return false;
			
			default:
				return false;
				
		}

	}
	
}