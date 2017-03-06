// Practical 2A Question 2
// Mark Glenn
// 23/09/2014
// Program for age in years and days
 import java.util.Scanner;
 public class P02A2 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
         // declare variables
         int age, days;
         
         System.out.print ("Enter your age: ");
         age = keyboardIn.nextInt();
         
         
         // do calculation
         days = age * 365;
         
         // display area on screen
         System.out.println("Your age in days is: " +days);
         
         
         }
      }   
