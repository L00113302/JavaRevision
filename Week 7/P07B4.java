// Practical P07B4
// Mark Glenn
// 25/09/2014
// Program using a do/while loop to ask for integers & count number of
// positive and negative values entered
import java.util.Scanner;
 
public class P07B4
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int num = 0, poscounter = 0, negcounter = 0;
      
      do
      {
      System.out.print ("Please enter an integer value: ");
      num = keyboardIn.nextInt();
      }
      
      while (num !=0);
      {
      
      if (num >= 1)
      {
      System.out.println ("The total number of positive numbers is: " +poscounter);
      poscounter++;
      }
      
      else
      {
      System.out.println ("The total number of negative numbers is: " +negcounter);
      negcounter++;
      }
      }
      
            
                 
   } // end main method
}// end class 
