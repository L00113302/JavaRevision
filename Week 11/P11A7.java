import java.util.Scanner;
public class P11A7
{
public static void main(String[] args)
{
   Scanner kb = new Scanner (System.in); 
   double prevAcc = 0.00, todaysAcc = 0.00, credLimit = 1000.00, exceeded = 0.00;
   System.out.println ("Please enter the previous account balance: ");
   prevAcc = kb.nextDouble();
   System.out.println ("Please enter todays account balance: ");
   todaysAcc = kb.nextDouble();
   account (prevAcc, todaysAcc, credLimit, exceeded);
}
   
   public static void account(double prevAcc, double todaysAcc, double credLimit, double exceeded)
   {
   
   if (prevAcc + todaysAcc > credLimit)
   {
   exceeded = (prevAcc + todaysAcc) - credLimit;
   }
   
   else
   {
   exceeded = 0.00;
   }
  
   System.out.println ("Credit Limit: " +credLimit);
   System.out.println ("Purchases to Date: " +prevAcc);
   System.out.println ("Today's Purchases: " +todaysAcc);
   System.out.println ();
   System.out.println ("Credit Limit exceeded by: " +exceeded);
   
   
   }
}          