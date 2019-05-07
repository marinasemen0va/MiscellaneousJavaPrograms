/**
 * this is the class that uses the DeckofCards class
 * @author Marina Semenova
 * @version 1.1 April 24, 2019
 */
public class DeckCardsClient
{
    /**
     * main method
     * @param args args
     */
    public static void main( String[] args ) {
        DeckofCards deck1 = new DeckofCards( );
        System.out.println("not shuffled");
        System.out.printf("%-20s%-20s%-20s\n", deck1.deal(), deck1.deal(), deck1.deal());
        System.out.println();
        System.out.printf("%-20s%-20s%-20s\n", deck1.deal(), deck1.deal(), deck1.deal());
        System.out.println();
        deck1.shuffle();
        System.out.println("shuffled");
        System.out.printf("%-20s%-20s%-20s\n", deck1.deal(), deck1.deal(), deck1.deal());
        System.out.println();
        System.out.printf("%-20s%-20s%-20s\n", deck1.deal(), deck1.deal(), deck1.deal());
    }
}











