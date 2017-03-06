// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

/** 
 * SimplePrint class which uses consoleprint
 * interface to print details to screen as
 * string.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */

public class SimplePrint implements ConsolePrint
{

   public void printInfo(String s)
   {
      if(s.length()!=0 || s!=null)
      {
         System.out.println(s);
      }
   }
}