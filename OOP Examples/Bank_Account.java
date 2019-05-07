/** represents a bank account
 * @author Marina Semenova
 * @version 1.0
 */
public class Bank_Account {
    // global vars declaration
    public long acct_num;
    private String type;
    private double balance;
    private float interest_rate;
    /** creates an account object with a number, type, and balance
     * @param acct account number
     * @param ty account type
     * @param bal balance in the account
     */
    public Bank_Account(long acct, double bal, String ty, float interest){
        acct_num = acct;
        type = ty;
        balance = bal;
        interest_rate = interest;
    }
    /** calculates interest for one month based on annual interest rate
     */
    public double getBalance(){
        return balance;
    }
    /** returns type of the account
     * @return account type
     */
    public String getType(){
        return type;
    }
    /** deposit specified amount of money into account
     * @param amt amount of money to be deposited
     */
    public void deposit (double amt){
        balance += amt;
    }
    /** withdraw specified amount of money from account if possible
     * @param amt amount of money to be withdrawn
     * @return boolean specifying whether the withdrawal was successful
     */
    public boolean withdraw(double amt){
        if (amt>0 && amt < balance){
            balance -= amt;
            return true;
        }
        else{
            return false;
        }
    }
    /** applies the interest rate and adds it to the balance
     */
    public void applyInterest(){
        balance += balance*interest_rate;
    }

}
