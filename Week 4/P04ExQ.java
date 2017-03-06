// Practical P04ExQ
// Mark Glenn
// 25/09/2014
// Program to deermine PhValue
 import java.util.Scanner;
 
 public class P04ExQ
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int phValue;
         String answer;
         
         System.out.print ("Please enter the Ph Value: ");
         phValue = keyboardIn.nextInt();
         
         // Do calculations
         if (phValue >= 0 && phValue < 7)
         System.out.println ("Acidic.");
         
         else if (phValue > 7 && phValue < 14)
         System.out.println ("Alkaline.");
         
         else if (phValue == 7)
         System.out.println ("Neutral.");
         
         else if (phValue > 14 || phValue < 0)
         System.out.println ("Invalid entry.");                
       
                 
         } // end main method
      }// end class 
