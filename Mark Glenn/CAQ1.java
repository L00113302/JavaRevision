// Mark Glenn
// Cloud & Green IT

import java.util.Scanner;
public class CAQ1
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
      
         // Create String
         String sentence = "Humpty Dumpty sat on the wall";
         // Create Variables
         int letters=0;
         char first=' ', last=' ', middle=' ';
         int space=0;
         
         System.out.println(sentence);
         
         letters = sentence.length();
         
         // Display Strings
         
         System.out.println("The sentence is " +sentence.length() +" letters and spaces long.");
         
         first=sentence.charAt(0);
         System.out.println("The first character is: "+first);
         
         last=sentence.charAt(letters-1);
         System.out.println("The last character is: "+last);
         
         middle=sentence.charAt(15);
         System.out.println("The middle character is: "+middle);
         
         String sentence2=sentence.replace("on the wall","by the sea");
         System.out.println(sentence2);
         
         String firstWord=sentence.substring(0,6);
         System.out.println(firstWord);
         
         String secondWord=sentence.substring(7,13);
         System.out.println(secondWord);
         
         space=sentence.indexOf(" ");
         int count=0, total=0;
         
         // Calculate amount of words
         
         for (int i=0; i<sentence.length(); i++)
         {
         if (i==space)
         count++;
         total=total+count;
         }
         
         System.out.println("The sentence has " +total +" words.");
         
         
      }
   }
}