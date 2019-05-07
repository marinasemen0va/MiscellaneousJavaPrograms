/**
 * the Book class
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */
public class Book
{
    String title;
    String course;
    /**
     * the constructor
     */
    public Book()
    {
    }
    /**
     * set title
     * @param thisTitle title to set
     */
    public void setTitle(String thisTitle)
    {
        title = thisTitle;
    }
    /**
     * set course
     * @param course course to set
     */
    public void setCourse(String course)
    {
        this.course = course;
    }
    /**
     * to string method
     * @return string representing object
     */
    public String toString()
    {
        return "The book " + title + " is needed for " + course + ".";
    }
}
