import java.util.Scanner;

public class VetDriver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        VetRecords pup = new VetRecords("Tim", "Wilks", "Max", "male", 10, 25.6, "Dog");
        System.out.println(pup.toString());
    }//end of main method
}//end of VetDriver class
