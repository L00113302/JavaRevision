// Practical P04B
// Mark Glenn
// 25/09/2014
// Program to determine price of cinema ticket
 import java.util.Scanner;
 
 public class P04B
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int age;
         double price;
         
         System.out.print ("Please enter your age: ");
         age = keyboardIn.nextInt();
         
         // Do calculations
         if (age < 12)
         price = 0;
         
         else if (age < 18)
         price = 5.00;
         
         else if (age > 65)
         price = 4.50;
         
         else
         price = 6.00; 
         
         System.out.println ("The price of your ticket is: " +price);               
       
                 
         } // end main method
      }// end class 
