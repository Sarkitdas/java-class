package FORM;

public class privat 
{
    private int A;
    private String Name;
    public void setName(String name)
    {
        this.Name=name;
    }
    public String getName() 
    {
        return Name;
    } 
    public void setInt(int a)
    {
        this.A=a;     //A=private A
    }
    public int getInt()
    {
        return A;   //private return
    }
}
