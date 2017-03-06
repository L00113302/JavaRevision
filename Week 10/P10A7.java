// Practical P10A7
// Mark Glenn
// 11/2014
// Program using a nested for loop to print 12 times tables
import java.util.*;
 
public class P10A7
{
   public static void main(String [] args)
   {
      for (int outer=1; outer<13; outer++)
      {
         for (int inner=1; inner<13; inner++)
         {
            System.out.print(inner +"*" +outer +"=" +(inner*outer) +" " );
         }
         System.out.println();
      }
   }
}