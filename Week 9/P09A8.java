// Practical P09A8
// Mark Glenn
// 11/2014
// Program using a for loop for number of students in class and average age
import java.util.*;
 
public class P09A8
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
   
   int n, age, total=0; 
   double average;
   {
   System.out.println("Please enter the number of students in the class: ");
   n = keyIn.nextInt();
   }
      for (int count=1; count <= n; count ++)
         {
         System.out.print("Please enter the age of the student: ");
         age = keyIn.nextInt();
         total = total + age;
         }
         
   average = total / n;
   
   {
   System.out.println ("The average age is: " +average);
   }
   }


}