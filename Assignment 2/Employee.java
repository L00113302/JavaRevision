// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

/** 
 * Employee class inheriting Person class and implementing
 * Comparable Employee. Contains private instance variables 
 * employeeID and Salary and static int idGenerator for
 * automatic generation of employee starting at 1.
 * Contains compareTo method comparing Employee salaries
 * and equals method comparing Employee name,age and EmployeeID.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */


public class Employee extends Person implements Comparable<Employee>, PartTimeAble
{
   // instance variables
   private int employeeID;
   private static int idGenerator;
   private double salary;
   private ConsolePrint printer = null;

   
   // constructors
   public Employee()
   {
      super();
      salary=0.0;
      employeeID = idGenerator++;
   }
   
   
   public Employee(String n, int a, double s)
   {
      super(n, a);
      this.salary = s;
      employeeID = idGenerator++;
   }
   
   public Employee(String name, int age, double salary, ConsolePrint printer)
   {
      super(name, age);
      this.salary=salary;
      this.printer=printer;
   }   

   /**
    * @param other anotherother employee
	 * @return compare employees by salary
 	 */
   @Override
   public int compareTo(Employee other)
   {
      return (int)(this.getSalary()-other.getSalary());
   } 
     
    /**
     * @param anotherEmployee another employee object
	  * @return if employees are equal compared by name,age and ID
 	  */ 
   @Override
   public boolean equals(Object anotherEmployee)
   {
      if (anotherEmployee instanceof Employee)
      {
         Employee e=(Employee)anotherEmployee;
         return (this.getName().equals(e.getName()) && this.getAge() == e.getAge() && this.employeeID == e.getEmpID());
      }
      return false;
   }
   
   /**
	 * @return print Employee details to screen
 	 */ 
   public String getDescription()
   {
      return super.getDescription() +" Salary: "+salary;
   }
   
    /**
	 * @return Employee ID
 	 */ 
   public int getEmpID()
   {
      return employeeID;
   }
   
   /**
	 * @return Salary
    */ 
   public double getSalary()
   {
      return salary;
   } 
   
   // set salary
   public void setSalary(double sy)
   {
      this.salary=sy;
   }   
   
   
   /**
    * @param j do a job
	 * @return salary + 40% of job price
 	 */ 
   @Override
   public boolean doJob(Job j)
   {
      salary = j.getPrice() * 0.40 + salary;
      return true;
   }
   
   // set printer to simpleprint or fancy print
   public void setPrinter(ConsolePrint p)
   {
      this.printer=p;
   }
   
   // use printer to print description
   public void printDescription()
   {
      // use console print interface
      printer.printInfo(this.getDescription());
    
   } 
             
   
}
