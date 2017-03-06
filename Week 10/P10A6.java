// Practical P10A6
// Mark Glenn
// 11/2014
// Program using a nested for loop to print numbers
import java.util.*;
 
public class P10A6
{
   public static void main(String [] args)
   {
      for (int outer=0; outer<3; outer++)
      {
         for (int inner=0; inner<=4; inner++)
         {
            System.out.print(inner +" ");
         }
         System.out.println();
      }
   }
}