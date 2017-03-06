// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

public class BubbleSortTester
{
   public static void main (String[]args)
   {
      CompanyDataBase myDb3 = new CompanyDataBase();
      
      myDb3.addEmployee(new Employee ("James Joyce", 24, 9001.00));
      myDb3.addEmployee(new Employee ("Mark Glenn", 32, 5640.00));
      myDb3.addEmployee(new Employee ("Michael O Brien", 92, 12045.00));
      myDb3.addEmployee(new Employee ("John Smith", 38, 20000.00));
      
      myDb3.bubbleSortBySalary();
      
      for(Employee currEmp: myDb3.getEmployees())
      {
         System.out.println(currEmp.getDescription());
      }  
      
    }
}      
