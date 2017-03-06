// Mark Glenn
// L00113302
// Assignment 2

/** 
 * Name Comparator for Employee
 *
 */


import java.util.*;

public class NameComparator implements Comparator<Employee>
{
   /**
    * @param lhs, rhs employee another employee
    * @return employee compared to other employee by name
    */
   public int compare(Employee lhs, Employee rhs)
   {
      return (lhs.getName().compareTo(rhs.getName()));
   }
}      