// Practical PO3A4
// Mark Glenn
// 25/09/2014
// Program to calculate discount and price of books
 import java.util.Scanner;
 
 public class P03A4
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double book1, book2, book3, grossPrice, totalPrice;
         
         //Read information from user
         System.out.print ("Please enter the price of book 1: ");
         book1 = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the price of book 2: ");
         book2 = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the price of book 3: ");
         book3 = keyboardIn.nextDouble();
         
         // do calculation
         grossPrice = book1 + book2 + book3;
         totalPrice = grossPrice - (grossPrice * 0.10);
         
         if (grossPrice > 50.00)
         
         // display to screen
         {
         System.out.println("The total price is: " + totalPrice);
         }
         if (totalPrice < 50.00)
         
         // display to screen
         {
         System.out.println("The total price is: " + grossPrice);
         }
         
         } // end main method
      }// end class 
