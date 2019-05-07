/**
 * the Locker class
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */
public class Locker
{
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];

    /**
     * constructor
     * @param me the Student to which the locker belongs
     */
    public Locker(Student me)
    {
        number = (int) (Math.random() * Integer.MAX_VALUE);
        owner = me;
        String[] title = {"Barron's AP", "Math Grade 10", "Science Grade 10", "Math Grade 9"};
        String[] course = {"ICS4U0", "MPM2D3", "SNC2D3", "MPM1D3"};
        for (int i = 0; i < 4; i++) {
            Book book = new Book();
            book.setCourse(course[i]);
            book.setTitle(title[i]);
            putABook(book);
        }
        studentJacket = me.myJacket;
    }

    /**
     * take a book out of the book array, if array empty return null
     * @param course course for which the book is needed
     * @return the book for the course or null if not there
     */
    public Book getABook(String course){
        int length = 0;
        if (books!= null) {
            length = books.length;
        }
        for (int x = 0; x < length; x++){
            if (books[x].course.equals(course)){
                int ind = 0;
                Book[] temp = new Book[length-1];
                for (int i = 0; i < length; i++){
                    if (i != x){
                        temp[ind] = books[i];
                        ind++;
                    }
                }
                Book r = books[x];
                books = temp;
                return r;
            }
        }
        return null;
    }

    /**
     * add book to array
     * @param book book to add
     */
    public void putABook(Book book){
        int length = 0;
        if (books!= null) {
             length = books.length;
        }
        Book[] temp = new Book[length + 1];
        for (int x = 0; x < length; x++){
            temp[x] = books[x];
        }
        temp[length] = book;
        books = temp;
    }

    /**
     * take jacket out of locker
     * @return jacket taken out
     */
    public Jacket getJacket()
    {
        owner.myJacket = studentJacket;
        studentJacket = null;
        return owner.myJacket;
    }

    /**
     * verifies owner of jacket is the same as locker's
     * @return Jacket if valid or null if not
     */
    public Jacket checkJacket()
    {
        if (studentJacket.owner.equals(owner)){
            return studentJacket;
        }
        return null;
    }

    /**
     * put jacket in locker
     * @param myJacket put into locker
     */
    public void putJacket(Jacket myJacket)
    {
        Jacket temp = studentJacket;
        studentJacket = myJacket;
        if (checkJacket() == null){
            studentJacket = temp;
        }
        owner.myJacket = null;
    }

    /**
     * assign owner of locker
     * @param me Student owner
     */
    public void assignOwner(Student me)
    {
        owner = me;
    }
    /**
     * to string method
     * @return string representing object
     */
    public String toString()
    {
        return "The locker # is " + number + ", the owner is " + owner;
    }
    
}
