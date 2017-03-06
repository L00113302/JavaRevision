// Practical P09A10
// Mark Glenn
// 11/2014
// Program using a for loop to find sum of integers between 1 an 100 evenly divisible by 7 OR 4
import java.util.*;
 
public class P09A10
{
   public static void main(String [] args)
   {
      int total=0;
   
      for (int count=1; count <=100; count++)
      {  
         if (count%7==0 || count%4==0)
            total = total + count;
      }
      System.out.println("Total sum of integers 1 to 100 evenly divisable by 7 OR 4: " +total);
   }

}