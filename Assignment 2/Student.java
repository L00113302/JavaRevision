// Mark Glenn
// L00113302
// Assignment 2

/** 
 * Student class extends person class implements parttimeable
 * includes instance variables beer money, course, job arraylist and printer.
 * Methods to do jobs and get beermoney for doing jobs. 
 * Get description and print to screen using console print interface.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */

import java.util.*;

public class Student extends Person implements PartTimeAble
{
   // instance variables
   private double beerMoney;
   private String course;
   private ArrayList<Job> jobs = new ArrayList<Job>();
   private ConsolePrint printer = null;
   
   // constructors
   public Student(String name, int age, String course)
   {
      super(name, age);
      this.course=course;
   }
   
   public Student(String name, int age, String course, ConsolePrint printer)
   {
      super(name, age);
      this.course=course;
      this.printer=printer;
   }   
   
   /**
    * @param j do a job and add to beer money
    * @return if job was done
    */
   @Override
   public boolean doJob(Job j)
   {
      beerMoney=j.getPrice()+beerMoney;
      jobs.add(j);
      return true;
   }
   
   /**
    * @return beer money
    */
   public double getBeerMoney()
   {
      return beerMoney;
   }
   
   /**
    * @return course
    */
   public String getCourse()
   {
      return course;
   }
   
   /**
    * @return student description
    */
   public String getDescription()
   {
      return "Name: "+this.getName() +" Age: "+this.getAge() +" Course: "+this.course +" Beer Money: "+this.beerMoney;
   }   
   
   /**
    * @return jobs done
    */
   public ArrayList<Job> getJobs()
   {
      return jobs;
   } 
   
   /**
    * @param p set printer to simpleprint or fancyprint
    */
   public void setPrinter(ConsolePrint p)
   {
      this.printer=p;
   }
   
   // use console print interface to print details
   public void printDescription()
   {
      printer.printInfo(this.getDescription());
   } 
   
         
}