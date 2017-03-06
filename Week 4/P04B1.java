// Practical P04B1
// Mark Glenn
// 25/09/2014
// Program to determine positive r negative number with pseudocode & chart
 import java.util.Scanner;
 
 public class P04B1
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int number;

         System.out.print ("Please enter the number: ");
         number = keyboardIn.nextInt();
         
         
         if (number > 0)
         {
         System.out.println ("The number is positive.");
         }
         
         else if (number < 0)
         {
         System.out.println ("The number is negative.");
         }
         
         else
         {
         System.out.println ("The number is zero. ");
         }
       
                 
         } // end main method
      }// end class 
