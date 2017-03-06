// Mark Glenn
// L00113302
// 21/10/2015

/**
 * The Player class represents the player, with its main characteristic being a location
 * and a health indicator.
 * In the game, the user will attempt to move a player in the optimum direction to
 * avoid being shot by enemies.
 * 
 * @author mark.glenn
 *
 */
public class Player extends GameCharacter
{
   
   private int health;
   
   public Player(Location location)
   {
         super(location);
         this.health = 5;
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
	
}