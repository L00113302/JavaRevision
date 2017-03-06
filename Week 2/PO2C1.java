// Practical PO2C1
// Mark Glenn
// 25/09/2014
// Program to calculate simple interest earned
 import java.util.Scanner;
 
 public class PO2C1 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double principle, rate, time, interest;
         
         //Read information from user
         System.out.print ("Please enter the principle: ");
         principle = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the rate: ");
         rate = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the time: ");
         time = keyboardIn.nextDouble();
         
         // do calculation
         interest = principle * rate * time;
         
         
         // display to screen
         System.out.println("The simple interest earned is: " +interest);
         
         
         }
      }   
