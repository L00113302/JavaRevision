// Practical PO5A5
// Mark Glenn
// 25/09/2014
// Program to assign a wire to a letter using switch statement
 import java.util.Scanner;
 
 public class P05A5
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         char wire;
         
         //Read information from user
         System.out.print ("Please enter the letter assigned to the wire: ");
         wire = keyboardIn.next().charAt(0);
         
         switch (wire)
         {
            case 'E': // sharing cases
            case 'e': System.out.print ("Earth - Green.");
               break;
            
            case 'N':
            case 'n': System.out.print ("Neutral - Blue.");
               break;
            
            case 'l':
            case 'L': System.out.print ("Live - Brown.");
               break;
            
            default: System.out.print ("Invalid Entry - Enter E, N or L.");
                         
             }// end switch
         
         
         } // end main method
      }// end class 
