// Practical P05B2
// Mark Glenn
// 25/09/2014
// Program calculate odd or even number using conditional operator
 import java.util.Scanner;
 
 public class P05B2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double number;
         
         System.out.print ("Please enter the number: ");
         number = keyboardIn.nextDouble();
         
         // Do calculations
         System.out.print (number%2==0 ? "That is an even number." : "That is an odd number.");
                 
         } // end main method
      }// end class 
