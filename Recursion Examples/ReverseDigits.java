/**
 * this class reverses an integer
 * @author marina semenova
 * @version 1.0 15/04/19
 */

public class ReverseDigits {
    /**
     * reverse digits method
     * @param num the number with one digit removed
     * @return the digits in an order so that they are reversed
     */
    private int reverse(int num){
        if (num != 0)
            return num%10*(int) Math.pow(10,(double) (int)Math.log10(num))+reverse(num/10);
        return 0;
    }
    /**
     * main method
     * @param args
     */
    public static void main (String[] args){
        ReverseDigits r = new ReverseDigits();
        int rev = r.reverse(378);
        System.out.println(rev);
    }
}
