// Practical P09A6
// Mark Glenn
// 11/2014
// Program using a for loop to find sum of integers between 1 an 100
import java.util.*;
 
public class P09A6
{
   public static void main(String [] args)
   {
      int total=0;
   
      for (int count=1; count <=100; count++)
      {
         total = total + count;
      }
      System.out.println("Total sum of integers 1 to 100: " +total);
   }

}