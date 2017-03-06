// Practical P04B4
// Mark Glenn
// 25/09/2014
// Program to calculate total pay
 import java.util.Scanner;
 
 public class P04B4
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double income;
         char status, taxBand;

         System.out.print ("Please enter the gross income: ");
         income = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the marital status: ");
         status = keyboardIn.next().charAt(0);
                 
         if (income < 2000 && status == 'S')
         {
         taxBand = 'A';
         }
                
         else if (income > 2000 && status == 'M')
         taxBand = 'C';
                 
         else if (income < 2000 && status == 'M')
         taxBand = 'B';
         
         else
         taxBand = 'D';
         { 
         System.out.println ("Your tax band is: " +taxBand);
         }
         } // end main method
      }// end class 
