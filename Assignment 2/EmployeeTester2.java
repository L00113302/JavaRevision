// Mark Glenn
// L00113302
// Assignment 2
// Employee tester

import java.util.*;

public class EmployeeTester2
{
   public static void main(String[] args)
   {
      
      ArrayList<Employee> myEmployees = new ArrayList<Employee>();
      
      myEmployees.add(new Employee("Mark Glenn", 22, 230.80));
      myEmployees.add(new Employee("James Smith", 32, 300.87));
      myEmployees.add(new Employee("Jack Whitehall", 68, 500));
      
      
      Employee z = new Employee("Mark Glenn", 22, 230.80);
      Employee x = z;
      
      Collections.sort(myEmployees);
      
      for(Employee e: myEmployees)
      {
         System.out.println(e.getDescription());
      }
      
      if (myEmployees.contains(new Employee("Mark Glenn", 22, 230.80)))
      {
         System.out.print("Employee found");
      }
      
      else
      {
         System.out.print("No employee found");
      }
             
     
   }
}   
