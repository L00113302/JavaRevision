// Mark Glenn
// L00113302
// Assignment 2

/** 
 * FancyPrint class which uses consoleprint
 * interface to print details to screen with
 * stars at top and bottom.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */


import java.util.*;
import java.util.StringTokenizer;
/**
 * prints string with stars above and below
 * String, uses split method to space words out by tab
 */
 
public class FancyPrint implements ConsolePrint
{
   public void printInfo(String p)
   {
      // eliminate empty or null strings
      if(p.length()!=0 && p!=null)
      {
         // use split method to find words seperated by space
         String[] result = p.split(" ");
      
         // print 100 stars horizontally 
         for ( int i = 0; i< 100;i++ )
         {
            System.out.print("*");
         }
         System.out.println();      
         System.out.println();
         
         // space words out using tab
         for(int i=0; i<result.length; i++)
         {
            System.out.print(result[i] + "\t");
         }
      }
      
      System.out.println();
      System.out.println();
      
      // print 100 stars horizontally
      for ( int i = 0; i < 100;i++ )
      {
         System.out.print("*");
      }
   
   
   }
  
}      
