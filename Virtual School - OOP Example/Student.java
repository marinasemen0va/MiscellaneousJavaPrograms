/**
 * the Student class
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */
public class Student
{
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];
    /**
     * constructor
     * @param name name of the student
     */
    public Student(String name)
    {
        this.name = name;
        myJacket = new Jacket(this);
        myLocker = new Locker(this);
        myLocker.putJacket(myJacket);
        String[] course = {"ICS4U0", "MPM2D3", "SNC2D3", "MPM1D3"};
        books = new Book[4];
        for (int x = 0; x < 4;x++){
            books[x] = myLocker.getABook(course[x]);
        }
        number = Integer.toString(myLocker.number);
    }
    /**
     * prints why a student was sent to the office
     * @param reason reason to be sent to office
     */
    public void sentToOffice(String reason)
    {
        System.out.println(reason);
    }
    /**
     * to string method
     * @return string representing object
     */
     public String toString()
     {
         return name;
     }
}
