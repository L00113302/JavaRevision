// Practical 2A Question 1
// Mark Glenn
// 23/09/2014
// Program to add two doubles
 import java.util.scanner
 public class P02A1 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
         // declare variable for two numbers
         double num1, num2, answer;
         
         System.out.print ("Enter the first number: ");
         num1 = keyboardIn.nextDouble();
         System.out.print ("Enter the second number: ");
         num2 = keyboardIn.nextDouble();
         
         // do calculation
         answer = num1 + num2;
         
         // display area on screen
         System.out.println("The answer is: " +answer);
         
         
         }
      }   
