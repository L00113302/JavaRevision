// Practical P07B5
// Mark Glenn
// 25/09/2014
// Program using a do/while loop and switch to count letters
import java.util.Scanner;
 
public class P07B5
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      char letter = ' ';
      int counter=0;
      
     
      
      do
      {
         System.out.print ("Please enter a letter: ");
         letter = keyboardIn.next().charAt(0);
           
      
      
         switch (letter)
         {
            case 'a':
            
            case 'e':
            
            case 'i':
            
            case 'o':
            
            case 'u':counter++;
               break;
         
         } 
      } while(letter != '.'); //end of do while
   
      {
         System.out.println ("The total vowels are: " +counter); // display vowels
      } 
   
                 
   } // end main method
}// end class 
