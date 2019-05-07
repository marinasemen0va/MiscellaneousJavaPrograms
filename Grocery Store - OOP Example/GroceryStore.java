/** represents a grocery store and extends store
 * @author Marina Semenova & Alyssa Wang
 * @version 1.0
 */
public class GroceryStore extends Store
{
    private int aisles;
    private int freezers;
    private int inventoryFull;
    private int fresh;
    private boolean liveAnimals;
    private boolean bakery;
    private String bestSeller;
    private int numberOfProducts;

    /** creates a default grocery store object
     */
    public GroceryStore () {
        aisles = 20;
        freezers = 5;
        inventoryFull = 8;
        fresh = 9;
        liveAnimals = false;
        bakery = true;
        bestSeller = "Milk";
        numberOfProducts = 10000;
    }

    /** creates a grocery store with two basic parameters
     * @param n name of the store
     * @param sl street location
     */
    public GroceryStore(String n, String sl){
        aisles=20;
        freezers=5;
        inventoryFull=8;
        fresh=9;
        liveAnimals=false;
        bakery=true;
        bestSeller="Milk";
        numberOfProducts=10000;
        setName(n);
        setArea(60,60);
        setConnected(false);
        setEmployees(15);
        setFloorNumber(1);
        setManager("Stacey");
        setCleanliness(7);
        setParkingSpaces(50);
        setStreetLocation(sl);
        setRegisters(4);
        calcRevenue(500000, 300000);
    }
    /** creates a grocery store object with all parameters
     * @param a aisles
     * @param f freezers
     * @param iF scale of inventory fullness 1-10
     * @param fr scale of freshness 1-10
     * @param lA if there's a live animal
     * @param b bakery
     * @param bS best-seller
     * @param p products
     * @param n name
     * @param l length
     * @param w width
     * @param c whether connected
     * @param e number of employees
     * @param fn floor number
     * @param m manager
     * @param cl scale of cleanliness 1-10
     * @param ps parking spaces
     * @param sl street location
     * @param r number of registers
     * @param in income
     * @param out outcome
     */
    public GroceryStore (int a, int f, int iF, int fr, boolean lA, boolean b, String bS, int p, String n, double l, double w, boolean c,int e, int fn, String m, int cl, int ps, String sl, int r, double in, double out)
    {
        if (a <= 0)
        {
            System.out.println ("Invalid amount of aisles. There are now 5 aisles.");
            aisles = 5;
        }
        else{
            aisles = a;
        }
        if (f <= 0)
        {
            System.out.println ("Invalid amount of freezers. There are now 3 freezers.");
            freezers = 3;
        }
        else{
            freezers = f;
        }
        if (iF>10||iF<=0)
        {
            System.out.println ("Number isn't 1-10. \"inventoryFull\" value is 5.");
            inventoryFull = 5;
        }
        else
        {
            inventoryFull = iF;
        }
        if (fr>10||fr<=0)
        {
            System.out.println ("Number isn't 1-10. \"fresh\" value is 8.");
            fresh = 8;
        }
        else
        {
            fresh = fr;
        }
        liveAnimals=lA;
        bakery=b;
        bestSeller=bS;
        if (p <= 0)
        {
            System.out.println ("Invalid amount of products. There are now 1000 products.");
            numberOfProducts = 1000;
        }
        else{
            numberOfProducts = p;
        }

        setName(n);
        if (l*w <= 0)
        {
            System.out.println ("Invalid area. Area set to 500.0m2.");
            setArea(50.0, 10.0);
        }
        else
        {
            setArea(l,w);
        }
        setConnected(c);
        if (e <= 0)
        {
            System.out.println ("Invalid number of employees. Employees set to 5.");
            setEmployees(5);
        }
        else
        {
            setEmployees(e);
        }
        if (fn <= 0)
        {
            System.out.println ("Invalid number of floors. Floor number set to 1.");
            setFloorNumber(1);
        }
        else
        {
            setFloorNumber(fn);
        }
        setManager(m);
        if (cl>10||cl<=0)
        {
            System.out.println ("Number isn't 1-10. \"cleanliness\" is set to 8.");
            setCleanliness(8);
        }
        else
        {
            setCleanliness(cl);
        }
        if (ps <= 0)
        {
            System.out.println ("Invalid number of parking spaces. Parking spaces  set to 3.");
            setParkingSpaces(3);
        }
        else
        {
            setParkingSpaces(ps);
        }
        setStreetLocation(sl);
        if (r <= 0)
        {
            System.out.println ("Invalid number of registers. Number of registers set to 2.");
            setRegisters(2);
        }
        else
        {
            setRegisters(r);
        }
        calcRevenue(in, out);
    }

    /** sets aisles
     * @param a number of aisles
     */
    public void setAisles (int a)
    {
        if (a <= 0)
        {
            System.out.println ("Please try again and enter a valid number of aisles.");
        }
        else{
            aisles = a;
        }

    }

    /** sets freezers
     * @param f number of freezers
     */
    public void setFreezers (int f)
    {
        if (f <= 0)
        {
            System.out.println ("Please try again and enter a valid number of freezers.");
        }
        else{
            freezers = f;
        }

    }

    /** sets level of inventory fullness
     * @param iF inventory fullness
     */
    public void setInventoryFull (int iF)
    {
        if (iF>10||iF<=0)
        {
            System.out.println ("Number isn't 1-10. \"inventoryFull\" value not changed. Try again.");
        }
        else
        {
            inventoryFull = iF;
        }
    }

    /** set freshness
     * @param fr level of freshness
     */
    public void setFresh (int fr)
    {
        if (fr>10||fr<=0)
        {
            System.out.println ("Number isn't 1-10. \"fresh\" value not changed. Try again.");
        }
        else
        {
            fresh = fr;
        }
    }

    /** set whether there's a live animal
     * @param lA whether of not there's a live animal
     */
    public void setLiveAnimals (boolean lA)
    {
        liveAnimals= lA;
    }

    /** set whether there is a bakery
     * @param b whether there is a bakery
     */
    public void setBakery (boolean b)
    {
        bakery = b;
    }

    /** set there is a best seller
     * @param bS best seller in the store
     */
    public void setBestSeller (String bS)
    {
        bestSeller = bS;
    }

    /** set the number of products in the store
     * @param p number of products
     */
    public void setNumberOfProducts (int p)
    {
        if (p <= 0)
        {
            System.out.println ("Please try again and enter a valid number of products.");
        }
        else{
            numberOfProducts = p;
        }

    }

    /** returns the number of aisles in the store (accessor method)
     * @return number of aisles
     */
    public int getAisles ()
    {
        return (aisles);
    }

    /** returns the number of freezers in the store (accessor method)
     * @return number of freezers
     */
    public int getFreezers ()
    {
        return (freezers);
    }
    /** returns how full the inventory is from a scale of 1-10  (accessor method)
     * @return the scale of fullness of the inventory
     */
    public int getInventoryFull ()
    {
        return (inventoryFull);
    }
    /** returns how full the getFresh is from a scale of 1-10  (accessor method)
     * @return a number of how fresh the products in the store are
     */
    public int getFresh ()
    {
        return (fresh);
    }
    /** returns whether or not there are live animals in the store (accessor method)
     * @return true or false based on if there are live animals or not
     */
    public boolean getLiveAnimals ()
    {
        return (liveAnimals);
    }
    /** returns whether or not there is a bakery in the store (accessor method)
     * @return true or false based on if there is a bakery or not
     */
    public boolean getBakery ()
    {
        return (bakery);
    }
    /** returns whether or not there is a bakery in the store (accessor method)
     * @return true or false based on if there is a bakery or not
     */
    public String getBestSeller ()
    {
        return (bestSeller);
    }

    /** returns number of products
     * @return number of products
     */
    public int getNumberOfProducts ()
    {
        return (numberOfProducts);
    }

    /** sets amount of products and how full is the inventory
     * @param p number of products
     * @param iF inventory fullness 1-10
     */
    public void stock (int p, int iF)
    {

        if ((p < numberOfProducts * -1)||(iF>10||iF<=0)){
            System.out.println ("Number of products is invalid and/or inventory fullness isn't 1-10. Try again.");
        }
        else
        {
            numberOfProducts+=p;
            inventoryFull = iF;
        }

    }

    /** add an aisles
     * @param a how many aisles to add
     */
    public void addAisle (int a)
    {
        if (a<=0)
        {
            System.out.println ("Please enter a valid number of aisles that you would like to add");
        }
        else
        {
            aisles+=a;
        }
    }

    /** remove aisles
     * @param a how many aisles to remove
     */
    public void removeAisle (int a)
    {
        if (a>aisles||a<=0)
        {
            System.out.println ("Please enter a valid number of aisles that you would like to remove.");
        }
        else
        {
            aisles-=a;
        }
    }

    /** add freezer
     * @param f how many freezers to add
     */
    public void addFreezer (int f)
    {
        if (f<=0)
        {
            System.out.println ("Please enter a valid number of freezers that you would like to add.");
        }
        else
        {
            freezers+=f;
        }
    }
    /** remove freezers
     * @param f how many freezers to remove
     */
    public void removeFreezer (int f)
    {
        if (f>freezers||f<=0)
        {
            System.out.println ("Please enter a valid number of freezers that you would like to remove.");
        }
        else
        {
            freezers-=f;
        }
    }
}