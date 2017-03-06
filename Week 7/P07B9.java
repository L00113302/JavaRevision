// Practical P07B9
// Mark Glenn
// 25/09/2014
// Program using increment decrement
import java.util.Scanner;
 
public class P07B9
{
   public static void main(String [] args)
   {
   
   int w = 13, x = 5, y = 23, z;

   w = w % x;
   y = y / x;
   z = w++ + ++x - --y;
   z = z++ * --x;
   System.out.println("w= " +w +" x= " +x);
   System.out.println("y= " +y +" z= " +z);

   
   } //end main method
} // end class
