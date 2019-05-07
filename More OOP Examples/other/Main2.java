public class Main2 {
    public static void main (String[] args){
        // person
        System.out.println("PERSON CLASS");
        Person p = new Person("Amelia", "Smith", "12/04/2003", 160, 120);
        Person p2 = new Person ("Nati", "Fitz", "06/30/1975", 165, 150);
        p.setName ("Amy", "Adams");
        p.setWeight(120);
        p.setHeight(160);
        System.out.println ("Date of birth of " + p.getName()+": "+ p.getDOB() + " (month - " + p.getDOB_month() + " day - " + p.getDOB_day() + " year - " + p.getDOB_year() + ")." );
        System.out.println (p.getName() + "'s weight is " + p.getWeight() + " and their height is " + p.getHeight() + ".");
        p2.setName ("Lia", "Fitz");
        p2.setWeight(150);
        p2.setHeight(165);
        System.out.println ("Date of birth of " + p2.getName()+": "+ p2.getDOB() + " (month - " + p2.getDOB_month() + " day - " + p2.getDOB_day() + " year - " + p2.getDOB_year() + ")." );
        System.out.println (p2.getName() + "'s weight is " + p2.getWeight() + " and their height is " + p2.getHeight() + ".");
        // wheel
        System.out.println("WHEEL CLASS");
        Wheel w = new Wheel ("Nameless Tire", "Model X", 5, "Winter");
        Wheel w2 = new Wheel ("Wheeeeeeel", "Cool Model", 4, "Spring");
        w.update_KM_usage(340);
        System.out.println("Brand: " + w.getBrand() + ", Model: " + w.getBrand());
        System.out.println("Size: " + w.getSize() + ", Season: " + w.getSeason() + ", KM: " + w.getKM() + ", Tread conditions: " + w.getTreadConditions());
        w2.update_KM_usage(380);
        System.out.println("Brand: " + w2.getBrand() + ", Model: " + w2.getBrand());
        System.out.println("Size: " + w2.getSize() + ", Season: " + w2.getSeason() + ", KM: " + w2.getKM() + ", Tread conditions: " + w2.getTreadConditions());
        // Course
        System.out.println("COURSE CLASS");
         Course c = new Course("ICS3U0", "Introduction to Computer Science", "Grade 12");
         Course c2 = new Course("MPM1D3", "Math", "Grade 9");
         System.out.println (c.getLevel()+ " " + c.getName() + " " + c.getCode());
         c.setMark(50);
         c.setStatus("failed");
         c.addAbsenses((byte)7);
         c.addLates((byte)1);
         System.out.println("Mark: " + c.getMark() + " " + c.getMarkG() + " Status: " + c.getStatus() + " Absences: " + c.getAbscenses() + " Lates: " + c.getLates());
         System.out.println (c2.getLevel()+ " " + c2.getName() + " " + c2.getCode());
         c2.setMark(80);
         c2.setStatus("completed");
         c2.addAbsenses((byte)3);
         c2.addLates((byte)2);
         System.out.println("Mark: " + c2.getMark() + " " + c2.getMarkG() + " Status: " + c2.getStatus() + " Absences: " + c2.getAbscenses() + " Lates: " + c2.getLates());
         // Vehicle
         Vehicle v = new Vehicle ("SUV", "Toyota", "RAV-4", (short) 2018, "Blue", (byte)4, 60.0f);
         Vehicle v2 = new Vehicle ("SUV", "Honda", "CRV", (short) 2016, "Blue", (byte)4, 40.0f);
         v.paint("light blue");
         v.gasUp(10);
         System.out.println(v.getColour() + " " + v.getManufact() + " " + v.getModel() + " " + v.getType() + ", # of doors: " + v.getDoors()  + ", Tank Size: " +  v.getTankSize() );
         System.out.println ("Can the car travel the entered distance? " + v.drive(50));
         v2.paint("dark blue");
         v2.gasUp(6);
         System.out.println(v2.getColour() + " " + v2.getManufact() + " " + v2.getModel() + " " + v2.getType() + ", # of doors: " + v2.getDoors()  + ", Tank Size: " +  v2.getTankSize() );
         System.out.println ("Can the car travel the entered distance? " + v2.drive(100));
         // Account
        Account a = new Account(587676678, "savings", 0);
        Account a2 = new Account(1298979090, "chequing", 0);
        a.deposit(300);
        a.withdraw(40);
        a.setInterestRate((float)0.08);
        a.calcInterest();
        System.out.println(a.getAccount() + " " + a.getType() + " account has a balance of " + a.getBalance());
        a2.deposit(6700);
        a2.withdraw(5550);
        a2.setInterestRate((float)0.07);
        a2.calcInterest();
        System.out.println(a.getAccount() + " " + a2.getType() + " account has a balance of " + a2.getBalance());

    }
}
