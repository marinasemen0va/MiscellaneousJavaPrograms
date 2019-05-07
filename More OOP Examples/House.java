/** represents a house
 * @author Marina Semenova
 * @version 1.0
 */

public class House{
    // global vars declaration
    private int street_num;
    private String street;
    private String city;
    private String province;
    private String postal_code;
    private double size;
    private boolean detached;
    private int stories;

    /** creates a /house object with a street number, street, city, province postal code, size, boolean stating if detached, and number of stories
     * @param n street number
     * @param s street name
     * @param c city name
     * @param pv province
     * @param p postal code
     * @param si size
     * @param d true if detached
     * @param l stories
     */
    public House (int n, String s, String c, String pv, String p, double si, boolean d, int l){ // constructor
        street_num = n;
        street = s;
        city = c;
        province = pv;
        postal_code = p;
        size = si;
        detached = d;
        stories = l;
    }

    /** displays address
     */
    public void displayAddress(){ // if called displays address
        System.out.println(street_num + " " + street);
        System.out.println(city + ", " + province);
        System.out.println (postal_code);
    }
}