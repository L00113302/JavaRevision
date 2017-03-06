// Practical P08A1
// Mark Glenn
// 25/09/2014
// Program using a do/while loop and counter for mobile phone pin
import java.util.*;
 
public class P08A1
{
   public static void main(String [] args)
   {
      // create random object
      Random noGenerator = new Random();
      
      // declare variable to store random number between 0 and 9
      int dice1=0, dice2=0, total=0;
      
      do
      {
      dice1 = noGenerator.nextInt(6);
      dice2 = noGenerator.nextInt(6);
      dice1++;
      dice2++;
      System.out.println("The value of the first dice is: " +dice1);
      System.out.println("The value of the second dice is: " +dice2);
      total = dice1 + dice2;
      System.out.print("The total value is: " +total);
      }
      while (dice1 == dice2);
      
     } //end method
} //end class
      
      
