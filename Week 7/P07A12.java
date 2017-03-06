// Practical P07A12
// Mark Glenn
// 25/09/2014
// Program using a while loop to display sum of numbers from 1 and n(user defined)
import java.util.Scanner;
 
public class P07A12
{
   public static void main(String [] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int counter=1, n = 0, total = 0;
      
      System.out.print ("Enter a number: ");
      n = keyboardIn.nextInt();
      
      while (counter <n)
      {
      total = total + counter;
      counter = total + 1;
      }
       
      System.out.print ("Total of numbers from 1 to n is: " +total);  
      
                 
   } // end main method
}// end class 
