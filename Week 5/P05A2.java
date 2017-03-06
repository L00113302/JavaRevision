// Practical PO5A2
// Mark Glenn
// 25/09/2014
// Program to determine vowel or not using switch statement
 import java.util.Scanner;
 
 public class P05A2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         char character;
         
         //Read information from user
         System.out.print ("Please enter the character: ");
         character = keyboardIn.next().charAt(0);
         
         switch (character)
         {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.print ("This is a vowel.");
               break;

            default: System.out.print ("This is not a vowel.");           
             }// end switch
         
         
         } // end main method
      }// end class 
