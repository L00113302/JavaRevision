// Practical P05B5
// Mark Glenn
// 25/09/2014
// Program to display message for average temperature
import java.util.Scanner;
 
public class P05B5
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      double temp1, temp2, temp3, average;
         
         
      System.out.print ("Please enter the first temperature: ");
      temp1 = keyboardIn.nextDouble();
         
      System.out.print ("Please enter the second temperature: ");
      temp2 = keyboardIn.nextDouble();
         
      System.out.print ("Please enter the third temperature: ");
      temp3 = keyboardIn.nextDouble();
         
         // Do calculations
      average = (temp1 + temp2 + temp3) / 3;
         
      if (average < 0)
         System.out.println ("FREEZING");
      else if   (average >= 1 && average <=9)
         System.out.println ("COLD");
      else if (average >9 && average <= 16)
         System.out.println ("MODERATE");
      else
         System.out.println ("WARM");
         
                 
   } // end main method
}// end class 
