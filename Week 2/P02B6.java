// Practical 202B6
// Mark Glenn
// 25/09/2014
// Program to calculate height in feet and inches
 import java.util.Scanner;
 
 public class P02B6
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int height, feet, inches;
         
         //Read information from user
         System.out.print ("Enter height in inches: ");
         height = keyboardIn.nextInt();
         
         
         // do calculation
         feet = height / 12;
         inches = feet % 12;
         
         
         // display to screen
         System.out.println("The height in feet and inches is: " +feet + " feet and " +inches +" inches.");
         
         
         }
      }   
