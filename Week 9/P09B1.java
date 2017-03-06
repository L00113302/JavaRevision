// Practical P09B1
// Mark Glenn
// 11/2014
// Program using a for loop for average temperature
import java.util.*;
 
public class P09B1
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
   
   int temp, total=0; 
   double average;
   
      for (int count=1; count<= 7; count++)
         {
         System.out.print("Please enter the temperature: ");
         temp = keyIn.nextInt();
         total = total + temp;
         }
         
   average = total / 7;
   
   {
   System.out.println ("The average temperature this week is: " +average);
   }
   }


}