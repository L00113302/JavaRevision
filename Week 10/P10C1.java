
import java.util.*;
 
public class P10C1
{
   public static void main(String [] args)
   {
      Scanner keyIn = new Scanner (System.in);
   
      double balance = 0.00, deposit = 0.00, withdraw = 0.00;
      char choice = ' ';
      int depositCount = 0, withdrawCount = 0, totalTransactions = 0;
   
      do
      {
         System.out.println ("Please enter your choice D for deposit, W for withdrawel or V for view balance: ");
         System.out.println ("Please enter R for receipt.");
         choice =keyIn.next().charAt(0);
      
         if ((choice != 'D') && (choice != 'W') && (choice != 'V') && (choice != 'R'))
         {
            System.out.println("Invalid Choice!");
         }
      
         if (choice == 'D')
         {
            System.out.print("How much would you like to deposit: ");
            deposit = keyIn.nextDouble();
         
            balance = deposit+balance;
            depositCount++;
         }
         
         else if (choice == 'W')
         {
            System.out.println ("How much would you like to withdraw: ");
            withdraw = keyIn.nextDouble();
         
            if (withdraw > balance)
            {
               System.out.println("Insufficient Funds!");
            }
            balance = balance - withdraw;
            withdrawCount++;
         }
         
         else if (choice == 'V')
         {
            System.out.println("Your balance is: " +balance);
         }
      
         totalTransactions = withdrawCount + depositCount;
      
      }while (choice!= 'R');
    
      System.out.println("Your account balance is: "+balance);
      System.out.println("Number of deposits made: "+withdrawCount);
      System.out.println("Number of deposits made: "+depositCount);
      System.out.println("Total transactions made: " +totalTransactions);
   
   
   }   
}
