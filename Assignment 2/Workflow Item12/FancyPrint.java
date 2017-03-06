// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

/**
 * prints string with stars above and below
 * String, uses split method to space words out by tab
 * and use first word as heading
 */

public class FancyPrint implements ConsolePrint
{
   public void printInfo(String p)
   {
      if(p.length()!=0 && p!=null)
      {
         String[] result = p.split(" ");
      
      
         for ( int i = 0; i< 14-result[0].length()/2;i++ )
         {
            System.out.print("*");
         }
         System.out.print(" ");
      
                  
         System.out.print(result[0]);
         System.out.print(" ");
      
         
         for ( int i = 0; i< 14-result[0].length()/2;i++ )
         {
            System.out.print("*");
         }
         
         System.out.println();      
         System.out.println();
         
         for(int i=1; i<result.length; i++)
         {
            System.out.print(result[i] + "\t");
         }
      }
      
      System.out.println();
      System.out.println();
   
      for ( int i = 0; i < 31;i++ )
      {
         System.out.print("*");
      }
      
   }
  
}      
