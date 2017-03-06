// Practical P03B3
// Mark Glenn
// 25/09/2014
// Program to calculate total expenses to employee
 import java.util.Scanner;
 
 public class P03B3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int miles;
         double allowance, totalExpenses;
         
         //Read information from user
         System.out.print ("Please enter the miles travelled: ");
         miles = keyboardIn.nextInt();
         
         System.out.print ("Please enter the allowance per mile: ");
         allowance = keyboardIn.nextDouble();
         
         if (miles > 150)
         totalExpenses = miles * allowance + 100;
         else
         totalExpenses = miles * allowance;
            
         {
         // display to screen
         System.out.println("The total expenses are: " +totalExpenses);
         }
         
         } // end main method
      }// end class 
