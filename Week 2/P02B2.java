// Practical 202B2
// Mark Glenn
// 25/09/2014
// Program to calculate volume of cylinder
 import java.util.Scanner;
 
 public class P02B2
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double height, radius, answer;
         
         //Read information from user
         System.out.print ("Please enter the radius: ");
         radius = keyboardIn.nextDouble();
         
         System.out.print ("Please enter the height: ");
         height = keyboardIn.nextDouble();
         
         final double PI = 3.141592;
         
         
         // do calculation
         answer = height * radius * PI;
         
         
         // display to screen
         System.out.println("The volume of the cylinder is: " + answer);
         
         
         }
      }   
