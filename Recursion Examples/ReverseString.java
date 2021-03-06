/**
 * this class reverses a sequence of string
 * @author marina semenova
 * @version 1.0 15/04/19
 */

import java.util.Scanner;

public class ReverseString {
    /**
     * @param str string array
     * @return string to add so that the string is reversed
     */
    private String reverse(String str){
        if (str.indexOf(" ") != -1){
            return reverse(str.substring(str.indexOf(" ") + 1)) + "\n" + str.substring(0, str.indexOf(" "));}
        return ".";
    }

    /**
     * i/o method
     * @return strings that were entered seperated by spaces in one string
     */
    public String readInput(){
        Scanner s = new Scanner(System.in);
        String string = "";
        final String SENTINEL = ".";
        String line = "";
        while (!line.equals(SENTINEL)){
            string += line + " ";
            line = s.nextLine();
        }
        line += SENTINEL;
        return string;
    }
    /**
     * main method
     * @param args
     */
    public static void main (String[] args){
        ReverseString r = new ReverseString();
        String string = r.readInput();
        String reversed = r.reverse(string);
        System.out.println(reversed);
    }
}
