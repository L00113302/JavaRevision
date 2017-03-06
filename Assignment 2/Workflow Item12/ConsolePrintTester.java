// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

public class ConsolePrintTester
{
   public static void main(String[] args)
   {
   SimplePrint o = new  SimplePrint();
   o.printInfo("This is my heading");
   
   System.out.println();
   System.out.println();
   
   FancyPrint f = new FancyPrint();
   f.printInfo("Heading this is quite fancy");
   }
}