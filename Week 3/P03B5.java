// Practical P03B5
// Mark Glenn
// 25/09/2014
// Program to determine if one number is multiple of another number
 import java.util.Scanner;
 
 public class P03B5
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int number1, number2;
         
         //Read information from user
         System.out.print ("Please enter the first number: ");
         number1 = keyboardIn.nextInt();
         
         System.out.print ("Please enter the second number: ");
         number2 = keyboardIn.nextInt();
         
         if (number1 % number2 == 0)
         {
         // display to screen
         System.out.println("The first number is a multiple of the second number.");
         }
         else
         {
         System.out.println("The first number is NOT a multiple of the second number.");
         }
         
         } // end main method
      }// end class 
