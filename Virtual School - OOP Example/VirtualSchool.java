/**
 * the VisualSchool class for the CrazyObjects problem
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */
public class VirtualSchool
{
 /**
  * main method
  * @param args args
  */
 public static void main (String[] args){
  Student me = new Student("Arthur");
  // attempt to enter the classroom of Mr. Strict
  ClassRoom ics4m1 = new ClassRoom("ICS4M1", "Mr. Reid");
  if (ics4m1.enter(me)) // by default books with student, jacket in locker, has a locker
  {
   System.out.println(me+" was allowed into class.");
  }
  else
  {
   System.out.println(me+" was not allowed into class."); // this prints because no book
  }

  System.out.println();
  ClassRoom ics4u0 = new ClassRoom("ICS4U0", "Ms. Krasteva");
  if (ics4u0.enter(me))
  {
   System.out.println(me+" was allowed into class.");
  }
  else
  {
   System.out.println(me+" was not allowed into class.");
  }

  System.out.println();
  me.myLocker.getJacket();
  if (ics4u0.enter(me))
  {
   System.out.println(me+" was allowed into class.");
  }
  else
  {
   System.out.println(me+" was not allowed into class.");
  }
 }
}