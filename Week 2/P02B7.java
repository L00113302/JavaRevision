// Practical 202B7
// Mark Glenn
// 25/09/2014
// Program to divide two numbers
 import java.util.Scanner;
 
 public class P02B7
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int num1, num2, answer, remainder;
         
         //Read information from user
         System.out.print ("Enter your first number: ");
         num1 = keyboardIn.nextInt();
         
         System.out.print ("Enter your second number: ");
         num2 = keyboardIn.nextInt();
         
         
         // do calculation
         answer = num1 / num2;
         remainder = num1 % num2;
         
         
         // display to screen
         System.out.println("The result is " +num1 +" divided by " +num2 +" equals " +answer +" remainder " +remainder);
         
         
         }
      }   
