// Practical 2A Question 6
// Mark Glenn
// 23/09/2014
// Program to enter initials
 import java.util.Scanner;
 public class P02A6 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
         // declare variables
         char initial1, initial2, answer;
         
         
         System.out.print ("Enter your first initial: ");
         initial1 = keyboardIn.next().charAt(0);
         
         System.out.print ("Enter your second initial: ");
         initial2 = keyboardIn.next().charAt(0);
         
      
         
         // display area on screen
         System.out.println("Your initials are: " +initial1 +initial2);
         
         
         }
      }   
