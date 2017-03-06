// Practical P04B2
// Mark Glenn
// 25/09/2014
// Program to determine balance with pseudocode & chart
 import java.util.Scanner;
 
 public class P04B2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double balance;

         System.out.print ("Please enter the balance: ");
         balance = keyboardIn.nextDouble();
         
         
         if (balance > 0)
         {
         System.out.println ("You are in credit by: " +balance);
         }
         
         else if (balance < 0)
         {
         System.out.println ("You are overdrawn by: " +balance);
         }
       
                 
         } // end main method
      }// end class 
