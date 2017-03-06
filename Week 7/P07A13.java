// Practical P07A13
// Mark Glenn
// 25/09/2014
// Program using a while loop to ask for a students results
import java.util.Scanner;
 
public class P07A13
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int counter=0, result=0;
      
      System.out.print ("Please enter the result: ");
      result = keyboardIn.nextInt();
      
      while (result >100 || result <0)
      {
         System.out.print ("Invalid Entry! Please enter the result: ");
         result = keyboardIn.nextInt();
      }
      
      {
         System.out.print ("The result is: " +result);
      }
        
      
                 
   } // end main method
}// end class 
