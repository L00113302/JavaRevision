// Practical PO3A5
// Mark Glenn
// 25/09/2014
// Program to calculate total price of computers
 import java.util.Scanner;
 
 public class P03A5
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int quantity, totalCost;
         
         //Read information from user
         System.out.print ("Please enter the amount of computers you want to buy: ");
         quantity = keyboardIn.nextInt();
         
         // do calculation
         if (quantity > 30)
         {
         totalCost = quantity * 500;
         
         // display to screen 
         System.out.println ("The total cost of your order is: " +totalCost);
         }
    
         // do calculation
         if (quantity < 30)
         {
         totalCost = quantity * 550;
         // display to screen
         System.out.println("The total cost of your order is: " +totalCost);
         }
         
         } // end main method
      }// end class 
