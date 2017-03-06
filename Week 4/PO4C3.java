// Practical P04C3
// Mark Glenn
// 25/09/2014
// Program claculate time zones
 import java.util.Scanner;
 
 public class P04C3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double time, nyTime, sfTime, sidneyTime;
         
         System.out.print ("Please enter Ireland time in 24hr format: ");
         time = keyboardIn.nextDouble();
         
         // Do calculations
         if (time >= 00.00 && time <= 24.00)
         {
         nyTime = time - 5;
         System.out.println ("The time in New York is: ");
         
         sfTime = time - 8; 
         System.out.println ("The time in San Fransisco is: ");
         
         sidneyTime = time + 10;
         System.out.println ("The time in Sidney is: ");
         }
         
         else
         System.out.println ("Invalid time.");               
       
                 
         } // end main method
      }// end class 
