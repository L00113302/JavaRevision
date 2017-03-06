// Practical P03C3
// Mark Glenn
// 25/09/2014
// Program to changes seconds to hrs mins n secs
 import java.util.Scanner;
 
 public class P03C3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int secs, hrs, mins, seconds;
         final int minutes = 60;

         System.out.print ("Please enter the time in seconds: ");
         secs = keyboardIn.nextInt();
         
         // Do calculations
         mins = secs / minutes;
         seconds = secs % minutes;
         hrs = mins / minutes;
         mins = mins % minutes;
                         
         System.out.println ("The time is: " +hrs +" hours, " +mins +" minutes and " +seconds +" seconds. ");
       
                 
         } // end main method
      }// end class 
