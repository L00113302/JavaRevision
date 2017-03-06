// Practical P03C1
// Mark Glenn
// 25/09/2014
// Program to calculate area of rectangle or triangle
 import java.util.Scanner;
 
 public class P03C1
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double length, height,answer, areaT, areaR;
         char ans;
         
         System.out.print ("Please enter the length: ");
         length = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the height: ");
         height = keyboardIn.nextDouble();
         
         System.out.print ("Please enter t for triangle or r for rectangle: ");
         ans = keyboardIn.next().charAt(0);
         
         
         areaT = (length * height)/2;
         areaR = length * height;
         
         if (ans == 't')
         {
         System.out.println ("The angle of the triangle is: " +areaT);
         }
         
         if (ans == 'r')
         {
         System.out.println ("The angle of the rectangle is: " +areaR);
         }
         
       
                 
         } // end main method
      }// end class 
