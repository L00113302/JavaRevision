import java.util.Scanner;
public class P12A4
{

   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner (System.in);
      double totalPrice;
      double first, second, third;
      System.out.print ("Please enter price of first book: ");
      first = keyIn.nextDouble();
      System.out.print ("Please enter price of second book: ");
      second = keyIn.nextDouble();
      System.out.print ("Please enter price of third book: ");
      third = keyIn.nextDouble();
      totalPrice = first + second + third;
                  
      // method call
      totalPrice = totalAmountDue (totalPrice);
      System.out.println ("The total amount due: " +totalPrice);
   }
   // method to return largest number
   public static double totalAmountDue ( double totalPrice)
      {
      if (totalPrice > 50.00)
         return totalPrice -(totalPrice * 0.10);
      
      else
         return totalPrice;   
      }
}            
  