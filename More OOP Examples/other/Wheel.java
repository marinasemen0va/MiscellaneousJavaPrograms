public class Wheel {
    private String brand;
    private String model;
    private int size;
    private String season;
    private int KM_usage;
    private String tread_conditions;

    public Wheel (String br, String mod, int siz, String sea){
        brand = br;
        model = mod;
        size = siz;
        season = sea;
        KM_usage = 0;
        tread_conditions= "new";
    }
    public void update_KM_usage (int km) {
        KM_usage += km;
        if (KM_usage> 1000){
            tread_conditions = "good";
        }
        else if (KM_usage> 5000){
            tread_conditions= "need changing";
        }
        else if (KM_usage> 10000)
        {
            tread_conditions= "bad";
        }
        else if (KM_usage> 20000)
        {
            tread_conditions= "dangerous";
        }
    }
    public String getBrand ()
    {
        return brand;
    }
    public String getModel ()
    {
        return model;
    }
    public int getSize ()
    {
        return size;
    }
    public String getSeason ()
    {
        return season;
    }
    public int getKM ()
    {
        return KM_usage;
    }
    public String getTreadConditions ()
    {
        return tread_conditions;
    }
}
