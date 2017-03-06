import java.util.Scanner;
public class P12A5
{

   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner (System.in);
    
      double avTemp;
      double first, second, third;
      System.out.print ("Please enter the first temperature: ");
      first = keyIn.nextDouble();
      System.out.print ("Please enter the second temperature: ");
      second = keyIn.nextDouble();
      System.out.print ("Please enter the third temperature: ");
      third = keyIn.nextDouble();
      
      double averageTemp;
      averageTemp = (first + second + third)/3;

            
      // method call
      temp = avTemp (temp);
      System.out.println ("The weather today is: " +avTemp);
   }
   // method to return largest number
   public static String avTemp (String temp)
      { 
      
         if (averagetemp < 0)
         return "FREEZING";
         else if (averageTemp >=1 && averageTemp <9)
         return "COLD";
         else if (averageTemp >=9 && averageTemp <16)
         return "MODERATE";
         else
         return "WARM";
         
      }
}            
  