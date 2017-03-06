// Practical 2A Question 4
// Mark Glenn
// 23/09/2014
// Program for hours to minutes
 import java.util.Scanner;
 public class P02A4 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
         // declare variables
         int hours, minutes;
         
         
         System.out.print ("Enter the amount of hours: ");
         hours = keyboardIn.nextInt();
         
         
         // do calculation
         minutes = hours * 60;
         
         // display area on screen
         System.out.println("The amount of minutes is: " +minutes);
         
         
         }
      }   
