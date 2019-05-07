/** main class for building Student, Car, House, and Animal objects and using their methods
 * @author Marina Semenova
 * @version 1.0
 */
public class Main {
    /** main
     * @param args
     */
    public static void main (String[] args)
    {
        // student
        System.out.println ("STUDENT CLASS");
        Student s1 = new Student ("Mark");
        s1.setMarks(90, 90);
        s1.calcAverage();
        System.out.println(s1.message() + " " + s1.name + "'s marks were " + s1.mark1 + " and " + s1.mark2 + ".");
        Student s2 = new Student("Wesley");
        s2.setMarks(80, 90);
        s2.calcAverage();
        System.out.println(s2.message() + " " + s2.name +"'s marks were " + s2.mark1 + " and " + s2.mark2 + ".");
        Student s3 = new Student("Bob");
        s3.setMarks(60, 90);
        s3.calcAverage();
        System.out.println(s3.message() + " " + s3.name +"'s marks were " + s3.mark1 + " and " + s3.mark2 + ".");
        Student s4 = new Student("Dean");
        s4.setMarks(75, 90);
        s4.calcAverage();
        System.out.println(s4.message() + " " + s4.name +"'s marks were " + s4.mark1 + " and " + s4.mark2 + ".");
        Student s5 = new Student("Sam");
        s5.setMarks(100, 90);
        s5.calcAverage();
        System.out.println(s5.message() + " " + s5.name +"'s marks were " + s5.mark1 + " and " + s5.mark2 + ".");
        // car
        System.out.println ("CAR CLASS");
        Car c1 = new Car("Ford", "Model T", 40.0, 50.0);
        c1.drive (30.0);
        System.out.println ("KM added to c1.");
        Car c2 = new Car("Honda", "CRV", 60.0, 80.0);
        c2.drive (50.0);
        System.out.println ("KM added to c2.");
        Car c3 = new Car("Ford", "Model T", 50.0, 60.0);
        c3.drive (40.0);
        System.out.println ("KM added to c3.");
        Car c4 = new Car("Toyota", "RAV-4", 30.0, 50.0);
        c4.drive (30.0);
        System.out.println ("KM added to c4.");
        Car c5 = new Car("Toyota", "RAV-4", 20.0, 50.0);
        c5.drive (20.0);
        System.out.println ("KM added to c5.");
        c5.gasUp();
        // house
        System.out.println("HOUSE CLASS");
        House h1 = new House(3, "Uplands Avenue", "Toronto", "Ontario", "M9R2B3", 34.0, true, 3);
        System.out.println("h1 address:");
        h1.displayAddress();
        House h2 = new House(5, "Uplands Avenue", "Toronto", "Ontario", "M9R2B5", 38.0, true, 2);
        System.out.println("h2 address:");
        h2.displayAddress();
        House h3 = new House(9, "Uplands Avenue", "Toronto", "Ontario", "M9R2B9", 44.0, false, 1);
        System.out.println("h3 address:");
        h3.displayAddress();
        House h4 = new House(10, "Uplands Avenue", "Toronto", "Ontario", "M9R2B0", 44.0, false, 1);
        System.out.println("h4 address:");
        h4.displayAddress();
        House h5 = new House(21, "Uplands Avenue", "Toronto", "Ontario", "M9R3B3", 33.0, true, 3);
        System.out.println("h5 address:");
        h5.displayAddress();
        // animal
        System.out.println("ANIMAL CLASS");
        Animal a1 = new Animal("penguin", 80);
        a1.feed("vegetables");
        System.out.println("a1 has eaten.");
        a1.sleep();
        System.out.println("a1 has slept.");
        Animal a2 = new Animal("tiger", 120);
        a2.feed("meat");
        System.out.println("a2 has eaten.");
        Animal a3 = new Animal("panda", 100);
        a3.feed("bread");
        System.out.println("a3 has eaten.");
        a3.sleep();
        System.out.println("a3 has slept.");
        Animal a4 = new Animal("sloth", 70);
        a4.feed("vegetables");
        System.out.println("a4 has eaten.");
        Animal a5 = new Animal("lion", 120);
        a5.feed("meat");
        System.out.println("a5 has eaten.");
    }
}
