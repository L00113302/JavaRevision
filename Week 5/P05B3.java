// Practical P05B3
// Mark Glenn
// 25/09/2014
// Program calculate insurance premium using conditional operator
import java.util.Scanner;
 
public class P05B3
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      double value, premium1, premium;
      int miles, age, points;
      
      System.out.print ("Please enter the number of penalty points: ");
      points = keyboardIn.nextInt();
      
      if (points > 8)
      {
         System.out.print ("Can not insure!");
      }
      else
         
      System.out.print ("Please enter the value of the car: ");
      value = keyboardIn.nextDouble();
         
      System.out.print ("Please enter the age of the owner: ");
      age = keyboardIn.nextInt();
         
      System.out.print ("Please enter miles per year: ");
      miles = keyboardIn.nextInt();
         
               
         // Do calculations
      premium1 = (value * 0.07);
         
         
         
      if (age >= 25 && miles < 15000 && value < 18000 && points < 8)
      {
         premium = premium1;
      }
      else if   (miles >= 15000)
      {
         premium = premium1 + 70;              
      }
      else if (age < 25 || value > 18000)
      {
         premium = premium1 + 120;
      }
      else if (age > 30 && points == 0)
      {
         premium = premium1 - (premium1 * 0.40);
      }
      else if (age >30 && points <=5)
      {
         premium = premium1 - (premium1 * 0.10);
      }
                 
      System.out.println ("Your insurance premium is: " + premium1);
                 
   } // end main method
}// end class 
