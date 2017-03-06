import java.util.Scanner;
public class P12A3
{

   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner (System.in);
      boolean oddReven;
      int number;
      System.out.print ("Type in number ");
      number = keyIn.nextInt();
      
      // method call
      oddReven = even (number);
      System.out.println ("That is " +oddReven);
   }
   // method to return largest number
   public static boolean even (int number)
      {
      if (number % 2 == 0)
         return true;
      else
         return false;   
      }
}            
  