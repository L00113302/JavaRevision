// Practical PO5A1
// Mark Glenn
// 25/09/2014
// Program to display grade using switch statement
 import java.util.Scanner;
 
 public class P05A1
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         char grade;
         
         //Read information from user
         System.out.print ("Please enter the grade: ");
         grade = keyboardIn.next().charAt(0);
         
         switch (grade)
         {
            case 'A': // sharing cases
            case 'a': System.out.print ("Excellent student.");
               break;
            case 'B':
            case 'b': System.out.print ("Good student.");
               break;
            case 'C':
            case 'c':
            case 'D':
            case 'd': System.out.print ("Fair student.");
               break;
            case 'E':
            case 'e':
            case 'F':
            case 'f': System.out.print ("Poor student.");
               break;
            default: System.out.print ("Invalid grade.");            
             }// end switch
         
         
         } // end main method
      }// end class 
