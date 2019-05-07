/** represents an airplane
 * @author Marina Semenova
 * @version 1.0
 */
public class Airplane {
    private int gasLevel;
    private String landingGear;
    private String doorStatus;
    private int passengers;

    /** default constructor for airplane object
     */
    public Airplane(){
        gasLevel = 0;
        landingGear = "Down.";
        doorStatus = "Closed.";
        passengers = 0;
    }

    /** open door
     */
    public void openDoor(){
        doorStatus = "Open";
    }

    /** close door
     */
    public void closeDoor(){
       doorStatus ="Closed.";
    }

    /** fill up
     */
    public void fillUp(){
        gasLevel = 100;
    }

    /** take off and decrease gas
     */
    public void takeOff(){
        gasLevel-=30;
    }

    /** finish take off and put landing gear up
     */
    public void doneTakeOff(){
        landingGear = "Up.";
    }

    /**normal flight and adjust gas
     * @param p percent of gas used
     */
    public void normalFlight(int p){
        gasLevel-= gasLevel * p / 100;
    }

    /** prep landing and put landing gear down
     */
    public void prepLanding(){
        landingGear = "Down.";
    }

    /** land and adjust gas
     */
    public void land(){
        gasLevel -= 15;
    }

    /** load passengers
     * @param p number of passengers
     */
    public void  loadPass (int p){
        passengers += p;
    }

    /** unload all passengers
     */
    public void unloadPass(){
        passengers= 0;
    }

    /** get gas level
     * @return amount of gas
     */
    public int getGasLevel(){
        return gasLevel;
    }

    /** get door status
     * @return door status
     */
    public String getDoorStatus(){
        return doorStatus;
    }

    /** get passengers
     * @return passengers
     */
    public int getPassengers(){
        return passengers;
    }

    /** get landing gear
     * @return landing gear status
     */
    public String getLandingGear() {
        return landingGear;
    }
}
