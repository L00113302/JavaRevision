// Practical 202B4
// Mark Glenn
// 25/09/2014
// Program to convert euro to sterling
 import java.util.Scanner;
 
 public class P02B4
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double euro, sterling;
         
         //Read information from user
         System.out.print ("Please enter the amount in euro: ");
         euro = keyboardIn.nextDouble();
         
         final double EXCHANGE_RATE = 0.84;
         
         
         // do calculation
         sterling = euro * EXCHANGE_RATE;
         
         
         // display to screen
         System.out.println("The amount in sterling is: " +sterling);
         
         
         }
      }   
