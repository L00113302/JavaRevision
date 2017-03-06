// Practical 2A Question 5
// Mark Glenn
// 23/09/2014
// Program for bank balance
 import java.util.Scanner;
 public class P02A5 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
         // declare variables
         double balance1, deposit, balance2;
         
         
         System.out.print ("Enter the current balance: ");
         balance1 = keyboardIn.nextDouble();
         
         System.out.print ("Enter the amount you wish to deposit: ");
         deposit = keyboardIn.nextDouble();
         
         
         
         
         // do calculation
         balance2 = balance1 + deposit;
         
         // display area on screen
         System.out.println("Your new balance is: " +balance2);
         
         
         }
      }   
