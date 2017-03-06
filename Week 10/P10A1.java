// Practical P10A1
// Mark Glenn
// 11/2014
// Program using a nested for loop to print stars
import java.util.*;
 
public class P10A1
{
   public static void main(String [] args)
   {
      for (int outer=0; outer<4; outer++)
      {
         for (int inner=0; inner<5; inner++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}