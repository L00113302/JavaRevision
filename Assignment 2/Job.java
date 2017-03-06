// Mark Glenn
// L00113302
// Assignment 2

/** 
 * Job class with instance variables and methods for job description,
 * rate per hour, time spent and calculate price of job (rate * time).
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */


import java.util.*;

public class Job
{
   // instance variables
   private String jobDescription;
   private double rate;
   private double time;
   
   // costructors
   public Job (String jobDescription, double rate, double time)
   {
      this.jobDescription=jobDescription;
      this.rate=rate;
      this.time=time;
   }
   
   /**
    * @return job description
    */
   public String getJobDescription()
   {
      return jobDescription;
   }
   
   /**
    * @return job price (rate*time)
    */
   public double getPrice()
   {
      return rate * time;
   }
   
   /**
    * @return rate
    */    
   public double getRate()
   {
      return rate;
   }
   
   /**
    * @return time
    */  
   public double getTime()
   {
      return time;
   }
   
   /**
    * @return job description and price
    */
   @Override
   public String toString()
   {
      return "Job: "+this.jobDescription +" Price: "+getPrice();
   }              
}