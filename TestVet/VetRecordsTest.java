import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetRecordsTest
{
    @Test
    public void initialToString()//will need to be changed as more variables are added
    {
    VetRecords dog = new VetRecords("Ty", "Ler", "Max", "Male", 10, 25.6, "Dog");
    String expected = "Owner: Ty, Ler; Pet: Max, Male, 10 years old, 25.6kg, Dog";
    assertEquals(expected, dog.toString());
    }

    @Test
    public void defaultConstructor()//will need to be changed as more variables are added
    {
        VetRecords dog = new VetRecords();
        String expected = "Owner: null, null; Pet: null, null, 0 years old, 0.0kg, null";
        assertEquals(expected, dog.toString());
    }

    //getNSet tests
    @Test
    public void fNameGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "Jess";
        blankPet.setFName("Jess");
        assertEquals(expected, blankPet.getFName());
    }

    @Test
    public void lNameGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "Newman";
        blankPet.setLName("Newman");
        assertEquals(expected, blankPet.getLName());
    }

    @Test
    public void petNameGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "Mossy";
        blankPet.setPetName("Mossy");
        assertEquals(expected, blankPet.getPetName());
    }

    @Test
    public void genderGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "female";
        blankPet.setGender("female");
        assertEquals(expected, blankPet.getGender());
    }

    @Test
    public void ageGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        int expected = 3;
        blankPet.setAge(3);
        assertEquals(expected, blankPet.getAge());
    }

    @Test
    public void weightGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        double expected = 12.4;
        blankPet.setWeight(12.4);
        assertEquals(expected, blankPet.getWeight());
    }

    @Test
    public void speciesGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "Dog";
        blankPet.setSpecies("Dog");
        assertEquals(expected, blankPet.getSpecies());
    }

    @Test
    public void nonValidFName()
    {
        VetRecords pet = new VetRecords("len", "Ney");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getFName());
    }

    @Test
    public void validFName()
    {
        VetRecords pet = new VetRecords("Len", "Ney");
        String expected = "Len";
        assertEquals(expected, pet.getFName());
    }

    @Test
    public void nonValidLName()
    {
        VetRecords pet = new VetRecords("Ren", "lie");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getLName());
    }

    @Test
    public void validLName()
    {
        VetRecords pet = new VetRecords("Len", "Lee-Won");
        String expected = "Lee-Won";
        assertEquals(expected, pet.getLName());
    }

    @Test
    public void nonValidPetName()
    {
        VetRecords pet = new VetRecords("max", "Male", 2);
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getPetName());
    }

    @Test
    public void validPetName()
    {
        VetRecords pet = new VetRecords("Max", "male", 2);
        String expected = "Max";
        assertEquals(expected, pet.getPetName());
    }

    @Test
    public void nonValidGender()
    {
        VetRecords pet = new VetRecords("Neo", "f", 1);
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getGender());
    }

    @Test
    public void validGender()
    {
        VetRecords pet = new VetRecords("Neo", "female", 1);
        String expected = "female";
        assertEquals(expected, pet.getGender());
    }
}