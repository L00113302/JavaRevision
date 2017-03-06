// Mark Glenn
// L00113302
// 21/10/2015
// SuperClass

/**
  * The GameCharacter class is a superclass containing the common characteristics
  * of the player and enemy classes, moveDirection and getLocation.
  * The enemy and player classes inherit from this superclass.
  *
  * @author mark.glenn
  *
  */
  
import java.util.*;
public class GameCharacter
{
private Location location; 

public GameCharacter(Location L)
{
location=L;
}

public Location getLocation()
{
return location;
}
/**
	 * Moves the player for each direction selection using getX, getY and changeX, changeY methods
	 * @param directionToMove
	 * @return whether a move was made or not. This may or may not be useful information to the calling code
	 */
	
  public boolean moveDirection( int directionToMove)
   {
      switch (directionToMove)
      {
         case (World.SOUTH):
            if(location.getX() < World.WORLD_HEIGHT - 1)
            {
               location.changeX(1);
               return true;
            }
            return false;
            
         case (World.NORTH):
            if(location.getX() > 0)
            {
               location.changeX(-1);
               return true;
            } 
            return false;
            
         case (World.EAST):
            if(location.getY() < World.WORLD_WIDTH -1)
            {
               location.changeY(1);
               return true;
            }
            return false;
            
         case (World.WEST):
            if(location.getY() > 0)
            {
               location.changeY(-1);
               return true;
            }
            return false; 
            
         case (World.SOUTH_EAST):
            if(location.getX() < World.WORLD_HEIGHT - 1 && location.getY() < World.WORLD_WIDTH -1)
            {
               location.changeY(1);
               location.changeX(1);
               return true;
            }
            return false;
            
         case (World.SOUTH_WEST):
            if(location.getX() < World.WORLD_HEIGHT - 1 && location.getY() > 0 )
            {  
               location.changeY(-1);
               location.changeX(1);
               return true;
            }
            return false;
         
         case (World.NORTH_EAST):
            if(location.getX() > 0 && location.getY() < World.WORLD_WIDTH -1)
            {
               location.changeY(1);
               location.changeX(-1);
               return true;
            } 
            return false;
            
         case (World.NORTH_WEST):
            if(location.getX() > 0 && location.getY() > 0 )
            {
               location.changeY(-1);   
               location.changeX(-1);
               return true;
            } 
            return false;
      	
         default:
            return false;
      		
      }
   
   } 
     		
}