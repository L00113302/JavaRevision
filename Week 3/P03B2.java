// Practical P03B2
// Mark Glenn
// 25/09/2014
// Program to calculate smallest of two numbers
 import java.util.Scanner;
 
 public class P03B2
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
         
         if (number1 < number2)
         {
         // display to screen 
         System.out.print (+number1);
         }
            
         else
         {
         // display to screen
         System.out.println(+number2);
         }
         
         } // end main method
      }// end class 
