import java.util.Scanner;

public class VetDriver
{
    public static void main(String[] args)
    {
        VetRecords pup = new VetRecords();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Name: ");
        pup.setFName(scan.nextLine());

        System.out.print("Enter Your Last Name: ");
        pup.setLName(scan.nextLine());

        System.out.print("Enter Your Pet's Name: ");
        pup.setPetName(scan.nextLine());

        System.out.print("Enter Your Pet's Gender: ");
        pup.setGender(scan.nextLine());

        System.out.print("Enter Your Pet's Age: ");
        pup.setAge(scan.nextInt());

        System.out.println("First Name: " + pup.getFName());
        System.out.println("Last Name: " + pup.getLName());
        System.out.println("Pet's Name: " + pup.getPetName());
        System.out.println("Pet's Gender: " + pup.getGender());
        System.out.println("Pet's Age: " + pup.getAge());
    }//end of main method
}//end of VetDriver class
