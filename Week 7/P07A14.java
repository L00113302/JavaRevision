// Practical P07B1
// Mark Glenn
// 25/09/2014
// Program using a do/while loop to ask for integers
import java.util.Scanner;
 
public class P07A14
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int num;
      
      do
      {
      System.out.print ("Please enter an integer value: ");
      num = keyboardIn.nextInt();
      }
      
      while( num !=0);
      {
      System.out.println ("That is the correct value. ");
      }
      
                 
   } // end main method
}// end class 
