// Practical 1C Question 5
// Mark Glenn
// 19/09/2014
// Program to display weight in pounds and stones

 public class weight 
   {
      public static void main(String [] args)
      {
         // declare variables
         int weight, stones, pounds;
         
         //assign values
         weight = 174;
         stones = weight / 14;
         pounds = weight % 14;
         
         //display weight on screen
         System.out.print("The weight is: " +stones +" stones and " +pounds +" pounds");
      }
   }      
         
