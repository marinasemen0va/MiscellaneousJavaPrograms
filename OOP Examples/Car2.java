/** represents a bank car
 * @author Marina Semenova
 * @version 1.0
 */
public class Car2 {
    // global vars declaration
    private String brand;
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;
    /** creates a car object with a brand, model, gas, and tank capacity
     * @param b brand
     * @param m model
     * @param g gas
     * @param tCap tank capacity
     */
    public Car2 (String b, String m, double g, double tCap){ // constructor
        brand = b;
        model = m;
        kilometres = 0;
        gas = g;
        tankCapacity = tCap;
    }
    /** adjusts total kilometres driven and gas based on kilometers driven
     * @param distance kilometres driven
     */
    public void drive(double distance){ // if method called then the distance travelled that was passed id added to km and gas is adjusted
        kilometres += distance;
        gas -= distance / 5;
    }

    /** resets gas to full amount
     */
    public void gasUp() { // if method called then gas tank is full
        gas = tankCapacity;
    }

    /** returns details about car
     * @return String that contains brand & model
     */
    public String getInfo(){
        return brand + " " + model;
    }
}