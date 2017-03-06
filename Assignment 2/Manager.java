// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

/** 
 * Manager class extends employee and person class
 * includes instance variable bonus and new methods getBonus, 
 * getDescription and overrides getSalary method to include bonus.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */

public class Manager extends Employee implements Comparable<Employee>, PartTimeAble
{
   // instance variables
   private double bonus;
   private ConsolePrint printer = null;

   
   // constructors
   public Manager()
   {
      super();
      this.bonus=0.0;
   }
   
   public Manager(String name, int age, double salary, double bonus)
   {
      super(name, age, salary);
      this.bonus=bonus;
   } 
    
   public Manager(String name, int age, double salary, ConsolePrint printer)
   {
      super(name, age, salary);
      this.printer=printer;
   }   

   
   // get methods
   
   /**
	 * @return bonus
 	 */ 
   public double getBonus()
   {
      return this.bonus;
   } 
   
   @Override
   public double getSalary()
   {
      return super.getSalary()+this.bonus;
   }      

   /**
	 * @return manager description & bonus
 	 */
   public String getDescription()
   {
      return  super.getDescription() +" Includes bonus: " +getBonus();
   }
   
   /**
    * @param j do a job
	 * @return salary + 70% of job price
 	 */ 
   @Override
   public boolean doJob(Job j)
   {
      super.setSalary(super.getSalary()+(j.getPrice() * 0.70));
      return true; 
   }
   
   /**
	 * @param p set printer to simpleprint or fancyprint
 	 */ 
   public void setPrinter(ConsolePrint p)
   {
      this.printer=p;
   }
   
   // use console print interface
   public void printDescription()
   {
      printer.printInfo(this.getDescription());
    
   } 
   


    
      
  
}