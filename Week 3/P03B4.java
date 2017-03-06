// Practical P03B4
// Mark Glenn
// 25/09/2014
// Program to calculate employees wages
 import java.util.Scanner;
 
 public class P03B4
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double hoursWorked, rateOfPay, overtime, wages;
         
         //Read information from user
         System.out.print ("Please enter the hours worked: ");
         hoursWorked = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the rate of pay: ");
         rateOfPay = keyboardIn.nextDouble();
         
         overtime = hoursWorked - 38;
         
         if (hoursWorked > 38)
         wages = hoursWorked * rateOfPay + overtime * (rateOfPay/0.5  + rateOfPay);
         else
         wages = hoursWorked * rateOfPay;
            
         {
         // display to screen
         System.out.println("The total wages are: " +wages);
         }
         
         } // end main method
      }// end class 
