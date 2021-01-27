public class VetRecords
{
    //variables
    public String FName;
    public String LName;
    public String petName;
    public String species;
    public boolean isMale;
    public int age;
    public double weight;

    //constructors
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

    //getters & setters
    public String getFName()
    {
        return FName;
    }

    public String getLName()
    {
        return LName;
    }

    public String getPetName()
    {
        return petName;
    }

    public boolean getIsMale()
    {
        return isMale;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getSpecies()
    {
        return species;
    }

    public void setFName(String FName)
    {
        this.FName = FName;
    }

    public void setLName(String LName)
    {
        this.LName = LName;
    }

    public void setPetName(String petName)
    {
        this.petName = petName;
    }

    public void setMale(boolean male)
    {
        isMale = male;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    //toString
    public String toString()
    {
        return "Owner: " + FName + ", " + LName + "; Pet: " + petName + ", " + age + " years old, " +
                weight + "kg, " + species;
    }
}