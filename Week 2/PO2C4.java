// Practical PO2C4
// Mark Glenn
// 25/09/2014
// Program to change time in seconds to hrs mins secs
 import java.util.Scanner;
 
 public class PO2C4
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int seconds, hrs, mins, secs;
         
         //Read information from user
         System.out.print ("Please enter the time in seconds: ");
         seconds = keyboardIn.nextInt();
         
         
         // do calculation
         hrs = seconds / 60;
         mins = hrs % 60;
         secs = mins % 60;
         
         
         // display to screen
         System.out.println("The time is: " +hrs +"hrs " +mins +"mins " +secs +"secs.");
         
         
         }
      }   
