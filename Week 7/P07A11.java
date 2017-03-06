// Practical P07A11
// Mark Glenn
// 25/09/2014
// Program using a while loop to display sum of numbers 10 to 100
import java.util.Scanner;
 
public class P07A11
{
   public static void main(String [] args)
   {
      
         // declare variables
      int counter=10, total = 0;
      while (counter <100)
      {
      total = total + counter;
      counter = total + 1;
      }
       
      System.out.print ("Total of numbers from 10 to 100 is: " +total);  
      
                 
   } // end main method
}// end class 
