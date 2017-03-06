// Practical P07A10
// Mark Glenn
// 25/09/2014
// Program using a while loop to display sum of numbers 1 to 10
import java.util.Scanner;
 
public class P07A10
{
   public static void main(String [] args)
   {
      
         // declare variables
      int counter=1, total = 0;
      while (counter <11)
      {
      total = total + counter;
      counter = total + 1;
      }
       
      System.out.print ("Total of numbers from 1 to 10 is: " +total);  
      
                 
   } // end main method
}// end class 
