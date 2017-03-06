// Practical P04C2
// Mark Glenn
// 25/09/2014
// Program for time to 24hr format
 import java.util.Scanner;
 
 public class P04C2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double time;
         
         System.out.print ("Please enter the time: ");
         time = keyboardIn.nextDouble();
         
         // Do calculations
         if (time >= 00.00 && time <= 24.00)
         System.out.println ("Valid.");
         
         else
         System.out.println ("Invalid.");               
       
                 
         } // end main method
      }// end class 
