/**
 * the ClassRoom class
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */
public class ClassRoom {
    String teacher;
    String course;

    /**
     * constructor
     * @param course course
     * @param teacher teacher
     */
    public ClassRoom(String course, String teacher){
        this.course = course;
        this.teacher = teacher;
    }
    /**
     * return whether or not the student can enter class
     * @param me Student in question
     * @return whether the student can enter
     */
    public boolean enter(Student me){
        System.out.println("Name: " + me);
        System.out.println("Teacher: " + teacher);
        System.out.println("Course: " + course);
        System.out.print(me + " has locker: ");
        if (me.myLocker != null){
            System.out.println("yes, " + me.myLocker);
        }
        else{
            System.out.println("no");
            me.sentToOffice("Get a locker.");
            return false;
        }
        System.out.print(me + " has jacket with: ");
        if (me.myJacket == null){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
            System.out.println("Go return jacket!");
            return false;
        }
        int length = 0;
        if (me.books!= null) {
            length = me.books.length;
        }
        System.out.println("Books until right one found:");
        for (int x = 0; x < length; x++){
            System.out.println(me.books[x]);
            if (me.books[x].course.equals(course)){
                return true;
            }
        }
        me.sentToOffice("Doesn't have the right book!");
        return false;
    }
}
