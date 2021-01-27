public class VetRecords
{
    public String FName;
    public String LName;
    public String petName;
    public String species;
    public boolean isMale;
    public int age;
    public double weight;

    public VetRecords(String firstName, String lastName, String petName, boolean isMale, int age, double weight, String species)
    {
        this.FName = firstName;
        this.LName = lastName;
        this.petName = petName;
        this.isMale = isMale;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public VetRecords()
    {
        FName = null;
        LName = null;
        petName = null;
        isMale = false;
        age = 0;
        weight = 0.0;
        species = null;
    }

}