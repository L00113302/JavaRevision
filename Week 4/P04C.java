// Practical P04C
// Mark Glenn
// 25/09/2014
// Program to determine time am/pm
 import java.util.Scanner;
 
 public class P04A3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double time, invalid;
         
         System.out.print ("Please enter the time: ");
         time = keyboardIn.nextDouble();
         
         // Do calculations
         
         if (time >= 13.00 && time < 24.00)
            {
            time = time - 12;
            System.out.println ("The time is " +time +" P.M.");
            }
         

         else if (time >= 12.00 && time < 13.00)
            {
            System.out.println ("The time is " +time +" P.M.");
            }
         
         else if (time < 12.00 && time >= 00.00)
            {
            System.out.println ("The time is " +time +" A.M.");
            }
         
         else
            {
            System.out.println ("That is an invalid answer.");
            }                
       
                 
         } // end main method
      }// end class 
