/** main class for Airplane
 * @author Marina Semenova
 * @version 1.0
 */
public class Main {
    /** main
     * @param args
     */
    public static void main (String[] args){
        Airplane a = new Airplane();
        a.openDoor();
        a.fillUp();
        System.out.println("Welcome!");
        System.out.println("___");
        System.out.println("Gas: " + a.getGasLevel());
        System.out.println("Landing gear: " + a.getLandingGear());
        System.out.println("Door status: " + a.getDoorStatus());
        a.loadPass(50);
        System.out.println("Passengers: " + a.getPassengers());
        System.out.println("___");
        System.out.println("Take off time!");
        System.out.println("___");
        a.closeDoor();
        System.out.println("Door status: " + a.getDoorStatus());
        a.takeOff();
        System.out.println("Gas: " + a.getGasLevel());
        a.doneTakeOff();
        System.out.println("___");
        System.out.println("Take off over!");
        System.out.println("___");
        System.out.println("Landing gear: " + a.getLandingGear());
        System.out.println("___");
        System.out.println("This flight is totally normal :)");
        System.out.println("___");
        a.normalFlight(45);
        System.out.println("Gas: " + a.getGasLevel());
        System.out.println("___");
        System.out.println("Yay it's time to land");
        System.out.println("___");
        a.prepLanding();
        a.land();
        System.out.println("Gas: " + a.getGasLevel());
        System.out.println("Landing gear: " + a.getLandingGear());
        System.out.println("___");
        System.out.println("BYE!!!");
        System.out.println("___");
        a.unloadPass();
        System.out.println("Passengers: " + a.getPassengers());
    }
}
