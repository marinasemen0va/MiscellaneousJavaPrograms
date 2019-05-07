/** main class for building Student objects and using their methods
 * @author Marina Semenova
 * @version 1.0
 */
public class MainStudent {
    /** main
     * @param args
     */
    public static void main (String[] args)
    {
        Student[] s = new Student[10];
        s[0] = new Student ("Mark");
        s[0].setMarks(60,90);
        s[1] = new Student("Wesley");
        s[1].setMarks(70,90);
        s[2] = new Student("Bob");
        s[2].setMarks(80,90);
        s[3] = new Student("May");
        s[3].setMarks(90,90);
        s[4] = new Student("Sam");
        s[4].setMarks(100,90);
        s[8] = new Student("Lea");
        s[8].setMarks(45,90);
        for (int x = 0; x < s.length;x++)
        {
            if (s[x] != null) {
                s[x].calcAverage();
                System.out.println(s[x].message() + " " + s[x].name +"'s marks were " + s[x].mark1 + " and " + s[x].mark2 + ".");
            }
        }
    }
}
