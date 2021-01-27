public class VetRecords
{
    public String FName;
    public String LName;
    public String species;
    public boolean isMale;
    public int age;
    public double weight;

    public VetRecords(String firstName, String lastName, boolean isMale, int age, double weight, String species)
    {
        FName = firstName;
        LName = lastName;
        isMale = isMale;
        age = age;
    }

    public VetRecords()
    {
        FName = null;
        LName = null;
        isMale = false;
        age = 0;
        weight = 0.0;
    }

}