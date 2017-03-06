// Mark Glenn
// L00113302
// Assignment 2
// Manager tester

import java.util.*;

public class ManagerTester
{
   public static void main(String[] args)
	{
      Manager m1 = (new Manager("Mark Glenn", 32, 230.80, 70.00));
      Manager m2 = (new Manager("James Robinson", 32, 350.45, 89.00));
     
      System.out.println(m1.getDescription());
      System.out.println(m2.getDescription());
      
      ArrayList<Manager> myManagers = new ArrayList<Manager>();
      
      myManagers.add(new Manager("Jimmy Hendrix", 22, 230.80, 36.00));
      myManagers.add(new Manager("James Smith", 32, 300.87, 89.00));
      myManagers.add(new Manager("Jack Whitehall", 68, 500, 40.00));
      
      Collections.sort(myManagers);
      
      for(Manager m: myManagers)
      {
         System.out.println(m.getDescription());
      }
      
      if (myManagers.contains(new Manager("Jimmy Hendrix", 22, 230.80, 70.00)))
      {
         System.out.print("Employee found");
      }
      
      else
      {
         System.out.println("No employee found");
      }
      
      System.out.println();
      
      // test doJob
       m1.doJob(new Job("Overtime", 10.00, 3));
      
      System.out.println(m1.getDescription());

   
   }
}