// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

public class DataBaseTester
{
   public static void main(String [] args)
   {
      CompanyDataBase myDb = new CompanyDataBase();
      
      myDb.addEmployee(new Employee("Mick Edwards", 43, 350));
      myDb.addEmployee(new Employee("James Smith", 56, 540));
      myDb.addEmployee(new Manager("Dick James", 32, 700, 200));
      myDb.addEmployee(new Employee("Derek Patterson", 22, 270));
      
      for(Employee currEmployee: myDb.getEmployees())
      {
         System.out.println(currEmployee.getDescription());
         // check if effective salary is correct
         System.out.println(currEmployee.getSalary());
      }
      
      System.out.println("About to sort");
      Collections.sort(myDb.getEmployees());
      
      for(Employee currEmployee: myDb.getEmployees())
      {
         System.out.println(currEmployee.getDescription());
      } 
      
      System.out.println(); 
      
      myDb.sortByName(); 
      
      for(Employee currEmployee: myDb.getEmployees())
      {
         System.out.println(currEmployee.getDescription());
      } 
      
      System.out.println();
      
      myDb.sortBySalary();
      
      for(Employee currEmployee: myDb.getEmployees())
      {
         System.out.println(currEmployee.getDescription());
      } 
   
      
   
   }   
}