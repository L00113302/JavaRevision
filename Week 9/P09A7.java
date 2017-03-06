// Practical P09A7
// Mark Glenn
// 11/2014
// Program using a for loop to find sum of EVEN integers between 1 an 100
import java.util.Scanner;
 
public class P09A7
{
   public static void main(String [] args)
   {
      int totalEven=0;
   
      for (int count=1; count <=100; count++)
      {  
         if (count%2==0)
         totalEven = totalEven + count;
      }
      System.out.println("Total sum of even integers 1 to 100: " +totalEven);
   }

}