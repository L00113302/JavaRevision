// Practical P03C2
// Mark Glenn
// 25/09/2014
// Program to to subtract small number from big number
 import java.util.Scanner;
 
 public class P03C2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int num1, num2, answer1, answer2;

         System.out.print ("Please enter the first number: ");
         num1 = keyboardIn.nextInt();
         
         System.out.print ("Please enter the second number: ");
         num2 = keyboardIn.nextInt();
         
         answer1 = num2 - num1;
         answer2 = num1 - num2;
         
         if (num2 > num1)
         {
         System.out.println ("The answer is:         " +answer1);
         }
         
         if (num1 > num2)
         {
         System.out.println ("The answer is:         " +answer2);
         }
         
         if (num1 == num2)
         {
         System.out.println ("The two numbers are equal. ");
         }
       
                 
         } // end main method
      }// end class 
