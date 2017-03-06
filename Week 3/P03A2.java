// Practical PO3A2
// Mark Glenn
// 25/09/2014
// Program for exam pass or fail
 import java.util.Scanner;
 
 public class P03A2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int examMark = 0;
         
         //Read information from user
         System.out.print ("Please enter your exam mark: ");
         examMark = keyboardIn.nextInt();
         
         if (examMark >= 40)
         
         
         // display to screen
         {
         System.out.println("You have passed the exam");
         }
         if (examMark < 40)
         
         {
         System.out.println("You have failed the exam");
         }
         
         } // end main method
      }// end class 
