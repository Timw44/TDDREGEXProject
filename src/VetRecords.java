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
    public String size;
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
        size = null;
        species = null;
    }//end of empty constructor

    public VetRecords(String fName, String lName)//person constructor
    {
        this.FName = FNameVal(fName);
        this.LName = LNameVal(lName);
        petName = null;
        gender = null;
        age = 0;
        weight = 0.0;
        size = null;
        species = null;
    }

    public VetRecords(String petName, String gender, int age, String size)// pet constructor
    {
        FName = null;
        LName = null;
        this.petName = PNameVal(petName);
        this.gender = GenderVal(gender);
        this.age = AgeVal(age);
        weight = 0.0;
        this.size = SizeVal(size);
        species = null;
    }

    public VetRecords(String firstName, String lastName, String petName, String gender, int age, double weight, String size, String species)
    {
        this.FName = FNameVal(firstName);
        this.LName = LNameVal(lastName);
        this.petName = PNameVal(petName);
        this.gender = GenderVal(gender);
        this.age = AgeVal(age);
        this.weight = weight;
        this.size = SizeVal(size);
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

    public String getSize() { return size;}

    public String getSpecies()
    {
        return species;
    }

    public void setFName(String FName)
    {
        this.FName = FNameVal(FName);
    }

    public void setLName(String LName)
    {
        this.LName = LNameVal(LName);
    }

    public void setPetName(String petName)
    {
        this.petName = PNameVal(petName);
    }

    public void setGender(String gender)
    {
        this.gender = GenderVal(gender);
    }

    public void setAge(int age)
    {
        this.age = AgeVal(age);
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setSize(String size) {
        this.size = SizeVal(size);
    }

    public void setSpecies(String species)
    {
        this.species = species;
    }

    //validation methods

    private String FNameVal(String firstName)
    {
        if(!firstName.matches("[A-Z][a-z]*"))
        {
            return "Not a valid entry. Try Again.";
            //firstName = input.nextLine();
        }
        return firstName;
    }//end of FNameVal method

    private String LNameVal(String lastName)
    {
        if(!lastName.matches("[A-Z]([-]|[A-z])*"))
        {
            return "Not a valid entry. Try Again.";
            //lastName = input.nextLine();
        }
        return lastName;
    }//end of LNameVal method

    private String PNameVal(String petName)
    {
        if(!petName.matches("[A-Z][A-z]*"))
        {
            return "Not a valid entry. Try Again.";
            //petName = input.nextLine();
        }
        return petName;
    }//end of PNameVal method

    private String GenderVal(String gender)
    {
        if(!gender.matches("(Male|male|Female|female)"))
        {
            return "Not a valid entry. Try Again.";
            //gender = input.nextLine();
        }
        return gender;
    }//end of GenderVal method

    private int AgeVal(int age)
    {
        String Ages = "" + age;
        if(!Ages.matches("[0-2][0-9]|[0-9]"))
        {
            return -1;//represents an error
           //Ages = input.nextLine();
        }
    //age = Integer.valueOf(Ages);
        return age;
    }//end of AgeVal method

    private String SizeVal(String size)
    {
        if(!size.matches("(L|M|S|Large|Medium|Small)"))
        {
            return "Not a valid entry. Try Again.";
            //gender = input.nextLine();
        }
        return size;
    }//end of SizeVal method

    public String needsDiet(double weight)
    {
        if(size.matches("(L|Large)") && weight > 40.0)
        {
            return "Needs a diet.";
        }
        else if(size.matches("(M|Medium)") && weight > 29.5)
        {
            return "Needs a diet.";
        }
        else if(size.matches("(S|Small)") && weight > 16.0)
        {
            return "Needs a diet.";
        }
        return "Doesn't need a diet.";
    }//end of needsDiet method

    //toString
    public String toString()
    {
        return "Owner: " + FName + ", " + LName + "; Pet: " + petName + ", " + gender + ", " + age + " years old, " +
                weight + "kg, " + size + ", " + species;
    }//end of toString
}//end of VetRecords class