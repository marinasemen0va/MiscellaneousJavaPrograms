/** represents an animal
 * @author Marina Semenova
 * @version 1.0
 */
public class Animal{
    // global vars declaration
    private String name;
    private boolean tired;
    private boolean hungry;
    private double weight;

    /** creates an animal object with a name and a weight
     * @param n name
     * @param w weight
     */
    public Animal(String n, double w) // constructor, assigns vars that are passed to class variables
    {
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }

    /** add weight based on what was eaten
     * @param v food
     */
    public void feed (String v) // if this method is called then weight is adjusted based on what was eaten (stored in string)
    {
        hungry = false;
        if (v.equals("vegetables")){
            weight += 2;
        }
        else if (v.equals("meat"))
        {
            weight += 4;
        }
        else {
            weight += 1;
        }
    }

    /** decrease weight if animal slept
     */
    public void sleep(){ // if method called then animal no longer sleepy and weight goes down
        tired = false;
        weight -= 3;
    }

}