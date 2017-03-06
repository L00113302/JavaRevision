// Practical PO5A7
// Mark Glenn
// 25/09/2014
// Program to display a statement based on day of the week using switch statement
import java.util.Scanner;
 
public class P05A7
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
   
      // declare variables
      int day;
      
      //Read information from user
      System.out.print ("Please enter the day: ");
      day = keyboardIn.nextInt();
      
      switch (day)
      {  
         case 1: // sharing cases
         case 2:
         case 3:
         case 4: 
         case 5:  System.out.println ("It is a weekday.");
            break;
            
         case 6:
         case 7: System.out.println ("The weekend is here!");
            break;
         
         default: System.out.print ("Incorrect day.");
                      
      }// end switch
      
      
   } // end main method
}// end class 
