// Practical PO3A3
// Mark Glenn
// 25/09/2014
// Program for number greater or less than 100
 import java.util.Scanner;
 
 public class P03A3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int number = 0;
         
         //Read information from user
         System.out.print ("Please enter your number: ");
         number = keyboardIn.nextInt();
         
         if (number > 100)
         
         
         // display to screen
         {
         System.out.println("OK");
         }
         if (number < 100)
         
         {
         System.out.println("Thanks");
         }
         
         } // end main method
      }// end class 
