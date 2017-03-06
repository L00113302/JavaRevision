// Practical 2A Question 1
// Mark Glenn
// 25/09/2014
// Program to display name and age
 import java.util.Scanner;
 
 public class PO2B1 
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         String name;
         int age, years, answer;
         
         //Read information from user
         System.out.print ("Please enter your name: ");
         name = keyboardIn.nextLine();
         
         System.out.print ("Please enter your age: ");
         age = keyboardIn.nextInt();
         
         System.out.print ("Please enter a period in years: ");
         years = keyboardIn.nextInt();
         
         // do calculation
         answer = age + years;
         
         
         // display to screen
         System.out.println("Hello: " +name);
          
         System.out.println("In " +years +" years time you will be " + answer +" years old.");
         
         
         }
      }   
