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

}