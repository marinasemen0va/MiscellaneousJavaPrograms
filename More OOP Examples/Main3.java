/** main class for building Bank_Account & Car2 objects and using their methods
 * @author Marina Semenova
 * @version 1.0
 */
public class Main3 {
    /** main
     * @param args
     */
    public static void main (String[] args) {
        System.out.println ("BANK_ACCOUNT CLASS");
        Bank_Account ba = new Bank_Account(879879070, 0, "savings", (float) 0.09);
        Bank_Account ba2 = new Bank_Account(789797897, 0, "chequing", (float) 0.07);
        ba.deposit(670);
        ba.withdraw(40);
        ba.applyInterest();
        System.out.println(ba.acct_num + " " + ba.getType() + " account has a balance of " + ba.getBalance());
        ba2.deposit(6700);
        ba2.withdraw(5550);
        ba2.applyInterest();
        System.out.println(ba2.acct_num + " " + ba2.getType() + " account has a balance of " + ba2.getBalance());
        // Car2 class
        System.out.println ("CAR2 CLASS");
        Car2 c = new Car2("Ford", "Model T", 40.0, 50.0);
        Car2 c2 = new Car2("Honda", "CRV", 60.0, 80.0);
        c.drive (30.0);
        System.out.println ("KM added to c.");
        System.out.println("c = " + c.getInfo());
        c2.drive (70.0);
        System.out.println ("KM added to c2.");
        System.out.println("c2 = " + c2.getInfo());
    }
}
