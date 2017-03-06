// Practical P04A
// Mark Glenn
// 25/09/2014
// Program to tell user exam grade
 import java.util.Scanner;
 
 public class P04A
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int examMark;
         String grade;
         
         System.out.print ("Please enter the exam mark: ");
         examMark = keyboardIn.nextInt();
         
         // Do calculations
         if (examMark >= 70)
         System.out.println ("Distinction.");
         
         else if (examMark >= 55)
         System.out.println ("Merit.");
         
         else if (examMark >= 40)
         System.out.println ("Pass.");
         
         else
         System.out.println ("Fail.");                
       
                 
         } // end main method
      }// end class 
