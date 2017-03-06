// Mark Glenn
// L00113302
// Assignment 2
// Employee tester

import java.util.*;

public class EmployeeTester
{
   public static void main(String[] args)
	   {
      
      Employee e1 = (new Employee("Mark Glenn", 22, 230.80));
      Employee e2 = (new Employee("James Smith", 32, 300.87));
      Employee e3 = (new Employee("Jack Whitehall", 68, 500));
      
      System.out.println(e1.getDescription());
      System.out.println(e2.getDescription());
      
      System.out.println(e1.compareTo(e2));
      
      if(e1.compareTo(e2)==0)
      {
      System.out.println("Same salary");
      }
      
      else
      {
      System.out.println("Different salaries");
      }
      
      System.out.println();
      
      e1.doJob(new Job("Overtime", 10.00, 3));
      
      System.out.println(e1.getDescription());
      
      Employee e5 = new Employee ("James McDaid", 45, 500);
      
      e5.setPrinter(new SimplePrint());
      
      e5.printDescription();
      
      e5.setPrinter(new FancyPrint());
      
      e5.printDescription();


      
      }
}      
   
