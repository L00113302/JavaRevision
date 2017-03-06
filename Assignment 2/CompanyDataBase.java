// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

/** 
 * CompanyDataBase class containing private arraylist of emplyees
 * with methods to add and get employees from the array list.
 * A sort by name method is also created which uses a name comparator
 * class and sort by salary method which uses the getSalary method 
 * inherited from the employee class.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */


public class CompanyDataBase
{
   // create private arraylist
   private ArrayList<Employee> employees = new ArrayList<Employee>();
   
   // constructors
   public CompanyDataBase()
   {
      this.employees=new ArrayList<Employee>();
   }
   
   // methods to add and get employees
   public void addEmployee(Employee newGuy)
   {
      this.employees.add(newGuy);
   }
   
   /**
    * @return employees
    */
   public ArrayList<Employee> getEmployees()
   {       
      return employees;
   }
   
   /**
    * @return employees sorted by name
    */
   public ArrayList<Employee> sortByName()
   {
      Collections.sort(employees, new NameComparator());
      return employees;
   }   
 
   /**
    * @return employees sorted by salary
    */
   public ArrayList<Employee> sortBySalary()
   {
      Collections.sort(employees);
      return employees;
   }   
   
   // bubble sort method sorts employees by salary from largest to smallest 
   public void bubbleSortBySalary()
   {
      Employee temp;
          
      for ( int i = 0; i < employees.size() - 1;i++ )
      {
      
         for ( int j = 0; j < employees.size() -i-1; j++)
         {
            if ( employees.get(j).compareTo(employees.get(j + 1)) < 0)
            {
               temp = employees.get(j);
               employees.set(j, employees.get(j + 1));
               employees.set(j+1,temp);
            }
         }
      }
     
   }
  
   
}