// Practical PO5A6
// Mark Glenn
// 25/09/2014
// Program to display number needed for team using switch statement
 import java.util.Scanner;
 
 public class P05A6
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         String sport;
         
         //Read information from user
         System.out.print ("Please enter the sport: ");
         sport = keyboardIn.next();
         
         switch (sport)
         {
            case "Tennis": // sharing cases
            case "Badminton": System.out.println ("1.");
               break;
            
            case "Basketball": System.out.println ("5.");
               break;
            
            case "Hurling":
            case "Football": System.out.println ("11.");
               break;
            
            default: System.out.println ("Unknown sport.");
                         
             }// end switch
         
         
         } // end main method
      }// end class 
