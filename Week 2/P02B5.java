// Practical 202B5
// Mark Glenn
// 25/09/2014
// Program to calculate discount of three items
 import java.util.Scanner;
 
 public class P02B5
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double item1, item2, item3, gross, discountEarned, totalDue;
         
         //Read information from user
         System.out.print ("Please enter the price of your first item: ");
         item1 = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the price of your second item: ");
         item2 = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the price of your third item: ");
         item3 = keyboardIn.nextDouble();
         
         final double DISCOUNT = 0.10;
         
         
         // do calculation
         gross = item1+item2+item3;
         discountEarned = gross * DISCOUNT;
         totalDue = gross - DISCOUNT;
         
         
         // display to screen
         System.out.println("The gross amount is: " +gross);
         System.out.println("The discount earned is: " +discountEarned);
         System.out.println("The total amount due is: " +totalDue);
         
         
         }
      }   
