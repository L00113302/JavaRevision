// Practical P04C1
// Mark Glenn
// 25/09/2014
// Program to get exam result
 import java.util.Scanner;
 
 public class P04C1
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int grade;
         
         System.out.print ("Please enter the grade: ");
         grade = keyboardIn.nextInt();
         
         // Do calculations
         if (grade < 40)
         System.out.println ("Failed.");
         
         else
         System.out.println ("Passed.");               
       
                 
         } // end main method
      }// end class 
