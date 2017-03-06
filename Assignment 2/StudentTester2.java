// Mark Glenn
// L00113302
// Assignment

import java.util.*;

public class StudentTester2
{
   public static void main (String[]args)
   {
   
      //create a student
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
      
      Student s3 = new Student ("James McDaid", 45, "Maths", null);
      
      s3.setPrinter(new SimplePrint());
      
      s3.printDescription();
      
      s3.setPrinter(new FancyPrint());
      
      s3.printDescription();
   }   
   
}
