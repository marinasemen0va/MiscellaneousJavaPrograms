/** represents a student
 * @author Marina Semenova
 * @version 1.0
 */
public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;

    /** creates a student object with a name
     * @param n name
     */
    public Student (String n){ // constructor
        name = n;
        mark1 = 0;
        mark2 = 0;
        average= 0.0;
    }

    /** sets marks
     * @param x mark 1
     * @param y mark 2
     */
    public void setMarks(int x, int y) { // if called sets marks to passed values
        mark1 = x;
        mark2 = y;
    }

    /** calculate average between the 2 marks
     */
    public void calcAverage(){ // if called calculates average
        average=(mark1+mark2)/2;
    }

    /** displays average
     * @return message
     */
    public String message(){ // if called displays message
        return name + " got an " + average + "%.";
    }
}