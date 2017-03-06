// Practical P08B1
// Mark Glenn
// 25/09/2014
// Program using a do/while loop to calculate mobile phone bill for student and lecturer

/* Ask student or lecturer
   If student:
   Get minutes used. Basic charge €15
   15c per minute for minutes between 50 & 100
   25c per minute after 100
   Total charges = total minutes + basic charge
   
   If lecturer:
   Get minutes used off peak
   Get minutes used peak
   Get texts used
   Basic charge €25
   First 100 minutes off peak free 10c per minute after
   First 75 minutes peak free 30c per minute after
   Total charges = total minutes + total texts + basic charge
   
   
   
*/
import java.util.Scanner;
 
public class P08B1
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      char service = ' ', ans = ' ';
      int minsUsed, peak, offPeak, texts;
      double basicCharge, addMinsOver50, addMinsOver100, addMinsUsed;
      double addTexts, peakCharges, offPeakCharges, callCharges, totalCharges;
  
     
      do
      {
      {
      System.out.println("Please enter 'S' for student or 'L' for lecturer: ");
      service = keyboardIn.next().charAt(0);
      }while (service == 'S' || 'L')
      {
      System.out.println ("Invalid entry.");
      }
      
      if (service = 'S')
      
      {
      System.out.print ("Please enter the minutes used: ");
      minsUsed = keyboardIn.nextInt();
      
      // do calculations
      addMinsOver50 = (minsUsed >50 && minsUsed <=100) * 0.10;
      addmMinsOver100 = (minsUsed - 100) * 0.25;
      basicCharge = 15;
      addMinsUsed = addMinsOver50 + addMinsOver100;
      totalCharges = addMinsUsed + basicCharge;
      // display bill
      System.out.println ("Basic Charge: "+basicCharge);
      System.out.println ("Cost of additional minutes used: " +addMinsUsed);
      System.out.println ("Total Amount Due: " + totalCharges);
      }
      else if (service = 'L')
      {
      {
      System.out.println ("Please enter minutes used Peak time: ");
      peak = keyboardIn.nextInt();
      System.out.println ("Please enter minutes used off Peak time: ");
      offPeak = keyboardIn.nextInt();
      System.out.println ("please enter text messages used: ");
      texts = keyboardIn.nextInt();
      }
      
      // do calculations
      if (peak > 75)
      {
      peakCharges = (peak - 75)*0.30;
      }
      else
      peakCharges = 0;
      
      
      if (offPeak > 100)
      {
      offPeakCharges = (offPeak - 100) * 0.10;
      }
      else
      {
      offPeakCharges = 0;
      }
      
      if (texts > 100)
      {
      addTexts = (texts - 100) * .10;
      }
      else
      {
      addTexts = 0;
      }
      
      callCharges = peakCharges + offPeakCharges;
      totalCharges = callCharges  + addTexts;
      // Display Bill
      {
      System.out.println ("Basic Charge: " +basicCharge);
      System.out.println ("Cost of additional minutes: " +callCharges);
      System.out.println ("Cost of additional texts: " +addTexts);
      System.out.println ("Total Amount Due: " + totalCharges);
      }
         do
       {
       System.out.println ("Would you like to enter another bill Y for yes or N for no? ");
       keyboardIn.next().charAt(0);
       }
      

       while (ans = 'Y' || ans = 'N');
            
      
      
      
      
     } //end method
} //end class
      
      
