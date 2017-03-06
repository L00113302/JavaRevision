// Practical 202B3
// Mark Glenn
// 25/09/2014
// Program to show amount of change due
 import java.util.Scanner;
 
 public class P02B3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double price, amount, change;
         
         //Read information from user
         System.out.print ("Please enter the price of the item: ");
         price = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the amount tendered: ");
         amount = keyboardIn.nextDouble();
         
         
         // do calculation
         change = amount - price;
         
         
         // display to screen
         System.out.println("The change due is: " +change);
         
         
         }
      }   
