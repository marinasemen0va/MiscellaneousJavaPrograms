/**
 * this class resembles the equals method for an array of comparable objects
 * @author marina semenova
 * @version 1.0 15/04/19
 */

public class SearchItem {
    /**
     * this is the method which does the comparing
     * @param arr the array (stays the same)
     * @param x the current element to check
     * @return whether or not the array (0 - arr.length-2) contains the element arr[arr.length - 1]
     */
    private boolean searchItem(Comparable[] arr, int x){
        if (x != arr.length - 1){
            if (arr[x].compareTo(arr[arr.length - 1])== 0){
                return true;}
            return searchItem(arr, x + 1);}
        return false;
    }
    /**
     * main method
     * @param args
     */
    public static void main(String[] args){
        SearchItem s = new SearchItem();
        Comparable[] array = {3, 4, 5};
        Comparable item = 3;
        Comparable[] newArray = new Comparable[array.length + 1];
        int length = array.length;
        for (int x = 0; x < length; x++){
            newArray[x] = array[x];
        }
        newArray[length] = item;
        boolean status = s.searchItem(newArray, 0);
        System.out.println(status);
    }
}
