public class Course  {
    private String code;
    private String name;
    private String level;
    private float mark;
    private String status;
    private byte lates;
    private byte absenses;

    public Course( String c, String n, String lev) {
       code = c;
       name = n;
       level = lev;
       mark = 0.0f;
       status = "";
       lates = 0;
       absenses = 0;
    }

    public String getMarkG(){
        if (mark >= 90){
            return "A+";
        }
        else if (mark >= 85){
            return "A";
        }
        else if (mark >= 80){
            return "A-";
        }
        else if (mark >= 77){
            return "B+";
        }
        else if (mark >= 73){
            return "B";
        }
        else if (mark >= 70){
            return "B-";
        }
        else if (mark >= 67){
            return "C+";
        }
        else if (mark >= 63){
            return "C";
        }
        else if (mark >= 60){
            return "C-";
        }
        else if (mark >= 55){
            return "D+";
        }else if (mark >= 50){
            return "D";
        }
        else {
            return "F";
        }

    }
    public float getMark(){
        return mark;
    }
    public String getStatus(){
        return status;
    }
    public String getLevel(){
        return level;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public byte getAbscenses(){
        return absenses;
    }
    public byte getLates(){
        return lates;
    }
    public void addLates(byte num){
        lates+= num;
    }
    public void addAbsenses(byte num){
        absenses += num;
    }
    public boolean setMark (float m){
        if (mark >= 0)
        {
            mark = m;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setStatus (String s){
        if (s.equals("completed") || s.equals("enrolled") || s.equals("failed")){
            status = s;
            return true;
        }
        else {
            return false;
        }
    }
}
