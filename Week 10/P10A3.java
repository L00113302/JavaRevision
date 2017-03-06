// Practical P10A3
// Mark Glenn
// 11/2014
// Program using a nested for loop to display the time
import java.util.*;
 
public class P10A3
{
   public static void main(String [] args)
   {
      for (int hours=0; hours<24; hours++)
      {
         for (int mins=0; mins<60; mins++)
         {
            System.out.print(hours +":" +mins +" ");
         }
         System.out.println();
      }
   }
}