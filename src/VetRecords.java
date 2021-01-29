import java.util.Scanner;

public class VetRecords
{
    Scanner input = new Scanner(System.in);
    //variables
    public String FName;
    public String LName;
    public String petName;
    public String species;
    public String gender;
    public int age;
    public double weight;


    //constructors
    public VetRecords()
    {
        FName = null;
        LName = null;
        petName = null;
        gender = null;
        age = 0;
        weight = 0.0;
        species = null;
    }//end of empty constructor

    public VetRecords(String firstName, String lastName, String petName, String gender, int age, double weight, String species)
    {
        this.FName = firstName;
        this.LName = lastName;
        this.petName = petName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }//end of all elements constructor

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

    public String getGender()
    {
        return gender;
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

    public void setGender(String gender)
    {
        this.gender = gender;
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

    //validation methods


    //toString
    public String toString()
    {
        return "Owner: " + FName + ", " + LName + "; Pet: " + petName + ", " + gender + ", " + age + " years old, " +
                weight + "kg, " + species;
    }//end of toString
}//end of VetRecords class