// Practical PO2C2
// Mark Glenn
// 25/09/2014
// Program to calculate time of investment needed
 import java.util.Scanner;
 
 public class PO2C2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double principle, rate, interest, time;
         
         //Read information from user
         System.out.print ("Please enter the principle: ");
         principle = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the rate: ");
         rate = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the interest: ");
         interest = keyboardIn.nextDouble();
         
         // do calculation
         time = interest / (principle * rate);
         
         
         // display to screen
         System.out.println("The time of investment needed is: " +time);
         
         
         }
      }   
