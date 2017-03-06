// Mark Glenn
// L00113302
// Assignment

import java.util.*;

public class StudentTester
{
   public static void main (String[]args)
   {
   
      //create a student
      Student s1 = new Student("Mark Glenn", 22, "Engineering");
      
      System.out.println(s1.getDescription());
      
      Student s2 = new Student ("James McClean", 45, "Maths");
      
      s2.doJob(new Job ("Wash floors", 5.00, 3));
      s2.doJob(new Job ("Walk dogs", 6.00, 2));
      
      // should have beer money
      System.out.println(s2.getDescription());
      
      // get jobs done and print info
      ArrayList<Job> jamesJobs = s2.getJobs();
      
      for(Job currJob : jamesJobs)
      {
         System.out.println(currJob.toString());
      }   
   }   
}
