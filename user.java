public class user
{
    private String name;
    private String ic;
    private int age;
    private String gender;
    private String typeCar;
    private int day;
    private int hour;
    
    public user()
    {
        name="";
        ic="";
        age=0;
        gender="";
        typeCar="";
        day=0;
        hour=0;
    }
    
    public user(String name,String ic,int age,String gender,String typeCar,int day,int hour)
    {
        this.name=name;
        this.ic=ic;
        this.age=age;
        this.gender=gender;
        this.typeCar=typeCar;
        this.day=day;
        this.hour=hour;
    }
    
    public void setUser(String n, String i,int a,String g,String t,int d,int h)
    {
        name=n;
        ic=i;
        age=a;
        gender=g;
        typeCar=t;
        day=d;
        hour=h;
    }
    
    public String getName()
    { 
        return name; 
    }
    
    public String getIc()
    { 
        return ic; 
    }
    
    public int getAge()
    { 
        return age; 
    }
    
    public String getGender()
    { 
        return gender; 
    }
    
    public String getTypeCar()
    { 
        return typeCar;
    }
    
    public int getDay()
    { 
        return day; 
    }
    
    public int getHour()
    { 
        return hour; 
    }
}