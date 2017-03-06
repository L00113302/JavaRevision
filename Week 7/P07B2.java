// Practical P07B2
// Mark Glenn
// 25/09/2014
// Program using a do/while loop to ask for integers with total
import java.util.Scanner;
 
public class P07B2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int num = 0, total = 0;
      
      do
      {
      System.out.print ("Please enter an integer value: ");
      num = keyboardIn.nextInt();
      total = total + num;
      }
      
      while( num !=0);
      {
      System.out.println ("The total is: " +total);
      }
      
                 
   } // end main method
}// end class 
