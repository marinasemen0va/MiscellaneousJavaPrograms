/**
 * the Jacket class
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */ 
public class Jacket
{
    Student owner;
    /**
     * constructor that assigns ownership
     * @param me the Student to which it belongs
     */
    public Jacket(Student me)
    {
        owner = me;
    }
    /**
     * to string method
     * @return string representing object
     */
    public String toString(){
        return "Jacket owner is " + owner;
    }
}
