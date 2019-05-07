public class Vehicle {
    String type;
    String manufacturer;
    String model;
    short year;
    String colour;
    byte numOfDoors;
    float gasTankSize;
    float gas;
    int km;

    public Vehicle(String typ, String manu, String mod, short yea, String col, byte nDoors, float tankS){
        type = typ;
        manufacturer = manu;
        model = mod;
        year = yea;
        colour = col;
        numOfDoors = nDoors;
        gasTankSize = tankS;
        gas = tankS;
        km = 0;
    }
    public void paint (String colour)
    {
        this.colour = colour;
    }
    public void gasUp(int litres){
        if (gas + litres < gasTankSize && litres > 0){
            gas += litres;
        }
    }
    public boolean drive (int distance){
        while (gas != 0){
            km += 1;
            if (km %5 == 0){
                gas -= 1;
            }
        }
        if (km >= distance){
            return true;
        }
        else{
            return false;
        }
    }
    public String getType(){
        return type;
    }
    public String getManufact(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public short getYear(){
        return year;
    }
    public String getColour(){
        return colour;
    }
    public byte getDoors(){
        return numOfDoors;
    }
    public float getTankSize(){
        return gasTankSize;
    }
}
