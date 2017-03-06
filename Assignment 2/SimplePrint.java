// Mark Glenn
// L00113302
// Assignment 2

/** 
 * SimplePrint class which uses consoleprint
 * interface to print details to screen as
 * string.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */


import java.util.*;

public class SimplePrint implements ConsolePrint
{
   //use consoleprint interface to print string
   public void printInfo(String s)
   {
      // eliminate empty and null strings
      if(s.length()!=0 && s!=null)
      {
         System.out.println(s);
      }
   }
}