// Practical P03B6
// Mark Glenn
// 25/09/2014
// Program to determine a cuctomers credit limit
 import java.util.Scanner;
 
 public class P03B6
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double accountBalance, purchases, exceeded, remaining;
         final double creditLimit = 1000.00;

         System.out.println ("Credit Limit:                    " +creditLimit);
         
         System.out.print ("Enter Purchases to Date:          ");
         accountBalance = keyboardIn.nextDouble();
         
         System.out.print ("Enter Today's Purchases:          ");
         purchases = keyboardIn.nextDouble();
         
         remaining = 1000 - (accountBalance + purchases);
         exceeded = accountBalance + purchases -1000;
         
         if (exceeded > 1000)
         {
         System.out.println ("Credit Limit exceeded by:         " +exceeded);
         }
         
         else
         {
         System.out.println ("Remaining Balance:         " +remaining);
         }
         
       
                 
         } // end main method
      }// end class 
