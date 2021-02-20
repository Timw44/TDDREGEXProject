import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetRecordsTest
{
    @Test
    public void initialToString()//will need to be changed as more variables are added
    {
    VetRecords dog = new VetRecords("Ty", "Ler", "Max", "Male", 10, 25.6, "M", "Dog");
    String expected = "Owner: Ty, Ler; Pet: Max, Male, 10 years old, 25.6kg, M, Dog";
    assertEquals(expected, dog.toString());
    }

    @Test
    public void defaultConstructor()//will need to be changed as more variables are added
    {
        VetRecords dog = new VetRecords();
        String expected = "Owner: null, null; Pet: null, null, 0 years old, 0.0kg, null, null";
        assertEquals(expected, dog.toString());
    }

    @Test
    public void personConstructor()//will need to be changed as more variables are added
    {
        VetRecords dog = new VetRecords("Jess", "Key");
        String expected = "Owner: Jess, Key; Pet: null, null, 0 years old, 0.0kg, null, null";
        assertEquals(expected, dog.toString());
    }

    @Test
    public void petConstructor()//will need to be changed as more variables are added
    {
        VetRecords dog = new VetRecords("Felix", "Male", 3, "Medium");
        String expected = "Owner: null, null; Pet: Felix, Male, 3 years old, 0.0kg, Medium, null";
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
    public void sizeGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "M";
        blankPet.setSize("M");
        assertEquals(expected, blankPet.getSize());
    }

    @Test
    public void speciesGetNSet()
    {
        VetRecords blankPet = new VetRecords();
        String expected = "Dog";
        blankPet.setSpecies("Dog");
        assertEquals(expected, blankPet.getSpecies());
    }


    //First Name tests
    @Test
    public void nonValidFName()
    {
        VetRecords pet = new VetRecords("len", "Ney");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getFName());
    }

    @Test
    public void nonValidFName2()
    {
        VetRecords pet = new VetRecords("Ty Ler", "Ney");
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
    public void validFName2()
    {
        VetRecords pet = new VetRecords("Nick", "Fur");
        String expected = "Nick";
        assertEquals(expected, pet.getFName());
    }


    //Last Name tests
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
        VetRecords pet = new VetRecords("Len", "Lee");
        String expected = "Lee";
        assertEquals(expected, pet.getLName());
    }

    @Test
    public void validLName2()
    {
        VetRecords pet = new VetRecords("Len", "Lee-Won");
        String expected = "Lee-Won";
        assertEquals(expected, pet.getLName());
    }


    //Pet Name Tests
    @Test
    public void nonValidPetName()
    {
        VetRecords pet = new VetRecords("max", "Male", 2, "Small");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getPetName());
    }

    @Test
    public void nonValidPetName2()
    {
        VetRecords pet = new VetRecords("Sky Ler", "Male", 2, "Small");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getPetName());
    }

    @Test
    public void nonValidPetName3()
    {
        VetRecords pet = new VetRecords("Max123", "Male", 2, "Small");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getPetName());
    }

    @Test
    public void validPetName()
    {
        VetRecords pet = new VetRecords("Max", "male", 2, "Small");
        String expected = "Max";
        assertEquals(expected, pet.getPetName());
    }

    @Test
    public void validPetName2()
    {
        VetRecords pet = new VetRecords("Sky", "male", 2, "Small");
        String expected = "Sky";
        assertEquals(expected, pet.getPetName());
    }


    //Gender tests
    @Test
    public void nonValidGender()
    {
        VetRecords pet = new VetRecords("Neo", "f", 1, "Medium");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getGender());
    }

    @Test
    public void nonValidMGender()
    {
        VetRecords pet = new VetRecords("Neo", "M", 1, "Medium");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getGender());
    }

    @Test
    public void validGender()
    {
        VetRecords pet = new VetRecords("Neo", "female", 1, "Medium");
        String expected = "female";
        assertEquals(expected, pet.getGender());
    }

    @Test
    public void validMGender()
    {
        VetRecords pet = new VetRecords("Neo", "Male", 1, "Medium");
        String expected = "Male";
        assertEquals(expected, pet.getGender());
    }


    //Age Tests
    @Test
    public void tooOld()
    {
        VetRecords pet = new VetRecords("Neo", "Female", 45, "S");
        int expected = -1;
        assertEquals(expected, pet.getAge());
    }

    @Test
    public void tooYoung()
    {
        VetRecords pet = new VetRecords("Neo", "Female", -4, "L");
        int expected = -1;
        assertEquals(expected, pet.getAge());
    }

    @Test
    public void veryOld()
    {
        VetRecords pet = new VetRecords("Gramps", "Male", 19, "L");
        int expected = 19;
        assertEquals(expected, pet.getAge());
    }

    @Test
    public void old()
    {
        VetRecords pet = new VetRecords("Pops", "Male", 12, "L");
        int expected = 12;
        assertEquals(expected, pet.getAge());
    }

    @Test
    public void teen()
    {
        VetRecords pet = new VetRecords("Ty", "Male", 7, "L");
        int expected = 7;
        assertEquals(expected, pet.getAge());
    }

    @Test
    public void young()
    {
        VetRecords pet = new VetRecords("Pup", "Male", 1, "L");
        int expected = 1;
        assertEquals(expected, pet.getAge());
    }


    //Size tests
    @Test
    public void largePet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "Large");
        String expected = "Large";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void lPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "L");
        String expected = "L";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void nonValidLPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "large");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void mediumPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "Medium");
        String expected = "Medium";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void mPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "M");
        String expected = "M";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void nonValidMPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "medium");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void smallPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "Small");
        String expected = "Small";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void SPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "S");
        String expected = "S";
        assertEquals(expected, pet.getSize());
    }

    @Test
    public void nonValidSPet()
    {
        VetRecords pet = new VetRecords("Oak", "male", 4, "small");
        String expected = "Not a valid entry. Try Again.";
        assertEquals(expected, pet.getSize());
    }


// Diet Tests
    @Test
    public void LDogNeedsDiet()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "L");
        String expected = "Needs a diet.";
        assertEquals(expected, pet.needsDiet(42.6));
    }

    @Test
    public void LDogAtLimit()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "L");
        String expected = "Doesn't need a diet.";
        assertEquals(expected, pet.needsDiet(40.0));
    }

    @Test
    public void LDogIsHealthy()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "Large");
        String expected = "Doesn't need a diet.";
        assertEquals(expected, pet.needsDiet(37.2));
    }

    @Test
    public void MDogNeedsDiet()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "M");
        String expected = "Needs a diet.";
        assertEquals(expected, pet.needsDiet(34.2));
    }

    @Test
    public void MDogAtLimit()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "M");
        String expected = "Doesn't need a diet.";
        assertEquals(expected, pet.needsDiet(29.5));
    }

    @Test
    public void MDogIsHealthy()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "Medium");
        String expected = "Doesn't need a diet.";
        assertEquals(expected, pet.needsDiet(28.9));
    }

    @Test
    public void SDogNeedsDiet()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "S");
        String expected = "Needs a diet.";
        assertEquals(expected, pet.needsDiet(20.0));
    }

    @Test
    public void SDogAtLimit()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "S");
        String expected = "Doesn't need a diet.";
        assertEquals(expected, pet.needsDiet(16.0));
    }

    @Test
    public void SDogIsHealthy()
    {
        VetRecords pet = new VetRecords("Peanut", "Male", 3, "Small");
        String expected = "Doesn't need a diet.";
        assertEquals(expected, pet.needsDiet(10.8));
    }
}