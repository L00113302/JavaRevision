import java.util.Scanner;
public class P11A4
{
public static void main(String[] args)
{
   Scanner kb = new Scanner (System.in); 
   char grade;
   System.out.println ("Please enter the grade: ");
   grade = kb.next().charAt(0);
   
   
   printGrade (grade);
}
   
   public static void printGrade(char grade)
   {
         
      if (grade == 'A')
      {
      System.out.println ("Excellent Student.");
      }
      
      else if (grade == 'B')
      {
      System.out.println ("Good Student.");
      }
      
      else if (grade == 'C' || grade == 'D')
      {
      System.out.println ("OK Student.");
      }
      
      else if (grade == 'F')
      {
      System.out.println ("FAIL!");
      }
   }
}              