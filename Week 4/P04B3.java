// Practical P04B3
// Mark Glenn
// 25/09/2014
// Program to calculate tax band
 import java.util.Scanner;
 
 public class P04B3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double hours, rateOfPay, totalPay;

         System.out.print ("Please enter the hours worked: ");
         hours = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the rate of pay: ");
         rateOfPay = keyboardIn.nextDouble();
         
         totalpay = hours * rateOfPay;
         
         if (hours > 0 && hours <= 37)
         totalPay = totalpay;
                 
         else if (hours > 37 && <= 40)
         totalPay = (totalPay * .10) + totalPay;
                 
         else if (hours > 40 <= 45)
         totalPay = (totalPay * .15) + totalPay;
         
         else
         totalPay = (totalpay * .20) + totalPay;
         { 
         System.out.println ("Your total pay is: " +totalPay);
         }
         } // end main method
      }// end class 
