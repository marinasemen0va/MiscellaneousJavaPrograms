/** represents a grocery store and extends store
 * @author Marina Semenova & Alyssa Wang
 * @version 1.0
 */
public class Store
{
    private String name;
    private double area;
    private boolean connected;
    private int employees;
    private int floorNumber;
    private String manager;
    private int cleanliness;
    private int parkingSpaces;
    private String streetLocation;
    private int registers;
    private double revenue;

    /** creates default object of a store
     */
    public Store ()
    {
        name="Shopify";
        area=6650.5;
        connected=false;
        employees=15;
        floorNumber=1;
        manager="Stacey";
        cleanliness=7;
        parkingSpaces=50;
        streetLocation="Bathurst Street";
        registers=4;
        revenue=500000.0;

    }

    /** creates a store object will all parameters
     * @param n name
     * @param a area
     * @param c whether or not connected
     * @param e number of employees
     * @param fn amount of floors
     * @param m manager
     * @param cl scale of cleanliness 1-10
     * @param ps amount of parking spaces
     * @param sl street location
     * @param r amount of registers
     * @param re revenue
     */
    public Store (String n, double a, boolean c,int e, int fn, String m, int cl, int ps, String sl, int r, double re)
    {
        name=n;
        if (a <= 0)
        {
            System.out.println ("Invalid area. Area set to 500.");
            area = 500.0;
        }
        else
        {
            area = a;
        }
        connected=c;
        if (e <= 0)
        {
            System.out.println ("Invalid number of employees. Employees set to 5.");
            employees = 5;
        }
        else
        {
            employees = e;
        }
        if (fn <= 0)
        {
            System.out.println ("Invalid number of floors. Floor number set to 1.");
            floorNumber=1;
        }
        else
        {
            floorNumber=fn;
        }
        manager=m;
        if (cl>10||cl<=0)
        {
            System.out.println ("Number isn't 1-10. \"cleanliness\" is set to 8.");
            cleanliness = 8;
        }
        else
        {
            cleanliness = cl;
        }
        if (ps <= 0)
        {
            System.out.println ("Invalid number of parking spaces. Parking spaces  set to 3.");
            parkingSpaces=3;
        }
        else
        {
            parkingSpaces=ps;
        }
        streetLocation=sl;
        if (r <= 0)
        {
            System.out.println ("Invalid number of registers. Number od registers set to 2.");
            registers=2;
        }
        else
        {
            registers=r;
        }
        revenue=re;
    }

    /** creates a store object with a name and street location
     * @param n name
     * @param sl street location
     */
    public Store(String n, String sl)
    {
        name=n;
        streetLocation=sl;
        area=470.0;
        connected=false;
        employees=2;
        floorNumber=1;
        manager="";
        cleanliness=9;
        parkingSpaces=0;
        registers=1;
        revenue=30000.0;
    }

    /** set name
     * @param n name
     */
    public void setName (String n)
    {
        name = n;
    }

    /** set area with length & width
     * @param l length
     * @param w width
     */
    public  void setArea (double l, double w){
        if (l <= 0 || w <= 0)
        {
            System.out.println ("Please try again and enter valid numbers.");
        }
        else
        {
            area = l*w;
        }
    }

    /** set employees
     * @param e number of employees
     */
    public void setEmployees (int e){
        if (e <= 0)
        {
            System.out.println ("Please try again and enter a valid number of employees.");
        }
        else
        {
            employees = e;
        }
    }

    /** sets whether the store is connected
     * @param c
     */
    public void setConnected (boolean c)
    {
        connected = c;
    }

    /** set number of floors
     * @param fn number of floors
     */
    public void setFloorNumber (int fn)
    {
        if (fn <= 0)
        {
            System.out.println ("Please try again and enter a valid number of floors.");
        }
        else{
            floorNumber = fn;
        }

    }

    /** set manager
     * @param m manager
     */
    public void setManager (String m)
    {
        manager = m;
    }

    /** set level of cleanliness
     * @param cl scale of cleanliness 1-10
     */
    public void setCleanliness (int cl)
    {
        if (cl>10||cl<=0)
        {
            System.out.println ("Number isn't 1-10. \"cleanliness\" value not changed. Try again.");
        }
        else
        {
            cleanliness = cl;
        }
    }

    /** set amount of parking spaces
     * @param ps parking spaces
     */
    public void setParkingSpaces (int ps)
    {
        if (ps<=0)
        {
            System.out.println ("Please try again and enter a valid number of parking spaces.");
        }
        else
        {
            parkingSpaces = ps;
        }
    }
    /**
     * @param sl set street location
     */
    public void setStreetLocation (String sl)
    {
        streetLocation = sl;
    }

    /** set amount of registers
     * @param r amount of registers
     */
    public void setRegisters (int r)
    {
        if (r<=0)
        {
            System.out.println ("Please try again and enter a valid number of registers.");
        }
        else
        {
            registers = r;
        }
    }

    /** get name
     * @return name
     */
    public String getName ()
    {
        return (name);
    }

    /** get area
     * @return area
     */
    public double getArea ()
    {
        return (area);
    }

    /** get whether connected
     * @return whether connected
     */
    public boolean getConnected ()
    {
        return (connected);
    }

    /** get amount of floors
     * @return number of floors
     */
    public int getFloorNumber ()
    {
        return (floorNumber);
    }

    /** get manager
     * @return manager
     */
    public String getManager ()
    {
        return (manager);
    }

    /**get number of employees
     * @return number of employees
     */
    public int getEmployees ()
    {
        return (employees);
    }

    /** get level of cleanliness
     * @return scale of cleanliness 1-10
     */
    public int getCleanliness ()
    {
        return (cleanliness);
    }

    /** get parking spaces
     * @return parking spaces
     */
    public int getParkingSpaces ()
    {
        return (parkingSpaces);
    }

    /** get street location
     * @return street location
     */
    public String getStreetLocation ()
    {
        return (streetLocation);
    }

    /** get registers
     * @return registers
     */
    public int getRegister ()
    {
        return (registers);
    }

    /** get revenue
     * @return revenue
     */
    public double getRevenue ()
    {
        return (revenue);
    }

    /** fire employee
     * @param e amount of fired employees
     */
    public void fireEmployee (int e)
    {
        if (e>employees || e<=0)
        {
            System.out.println ("Please enter a valid number of employees you would like to fire.");
        }
        else
        {
            employees-=e;
        }
    }

    /** hire employee
     * @param e number of employees hired
     */
    public void hireEmployee (int e)
    {
        if (e<=0)
        {
            System.out.println ("Please enter a valid number of employees you would like to hire.");
        }
        else
        {
            employees+=e;
        }
    }

    /** hire new manager
     * @param m name of new manager
     */
    public void hireNewManager (String m)
    {
        manager=m;
    }

    /** add register
     * @param r amount of registers added
     */
    public void addRegister (int r)
    {
        if (r<=0)
        {
            System.out.println ("Please enter a valid number of registers you would like to add.");
        }
        else
        {
            registers+=r;
        }
    }
    /** remove register
     * @param r amount of registers removed
     */
    public void removeRegister (int r)
    {
        if (r>registers || r<=0)
        {
            System.out.println ("Please enter a valid number of registers you would like to remove.");
        }
        else
        {
            registers-=r;
        }
    }

    /** calculate revenue
     * @param in income
     * @param out outcome
     */
    public void calcRevenue (double in, double out)
    {
        revenue= in-out;
    }
}








