// Practical 2A Question 3
// Mark Glenn
// 23/09/2014
// Program for area of a circle
 import java.util.Scanner;
 public class P02A3 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
         // declare variables
         double radius, area;
         
         final double PI = 3.14;
         
         System.out.print ("Enter the radius of the circle: ");
         radius = keyboardIn.nextDouble();
         
         
         // do calculation
         area = PI * radius * radius;
         
         // display area on screen
         System.out.println("The area of the circle is: " +area);
         
         
         }
      }   
