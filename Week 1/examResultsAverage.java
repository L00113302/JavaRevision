// Practical 1C Question 4
// Mark Glenn
// 19/09/2014
// Program to calculate the average of exam results

 public class examResultsAverage 
   {
      public static void main(String [] args)
      {
         // declare variables
         int result1, result2, result3, average;
         
         //assign values
         result1 = 100;
         result2 = 98;
         result3 = 65;
         
         //do calculation
         average = (result1 + result2 + result3) / 3;
         
         //display average on screen
         System.out.print ("The average exam result is " +average);
      }
   }      
