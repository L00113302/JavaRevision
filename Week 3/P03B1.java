// Practical P03B1
// Mark Glenn
// 25/09/2014
// Program to calculate odd or even number
 import java.util.Scanner;
 
 public class P03B1
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int number;
         
         //Read information from user
         System.out.print ("Please enter the number: ");
         number = keyboardIn.nextInt();
         
         if (number % 2 == 0)
         {
         // display to screen 
         System.out.println ("The number is even. ");
         }
            
         else
         {
         // display to screen
         System.out.println("The number is odd. ");
         }
         
         } // end main method
      }// end class 
