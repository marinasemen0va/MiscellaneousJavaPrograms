public class Account {
    private long account;
    private String type;
    private double balance;
    private float interestRate;
    public Account(long acc, String typ, double bal){
        account = acc;
        type = typ;
        balance = bal;
        interestRate = 0.0f;
    }
    public void calcInterest(){
        balance += balance*(interestRate/12);
    }
    public boolean withdraw(double amt){
        if (amt>0 && amt < balance){
            balance -= amt;
            return true;
        }
        else{
            return false;
        }
    }
    public void deposit (double amt){
        balance += amt;
    }
    public double getBalance(){
        return balance;
    }
    public long getAccount(){
        return account;
    }
    public String getType(){
        return type;
    }
    public void setInterestRate(float i){
        interestRate = i;
    }

}
