import java.util.Scanner;

public class VetDriver
{
    public static void main(String[] args)
    {
        VetRecords pup = new VetRecords();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        pup.setFName(scan.nextLine());
        System.out.println("Enter Your Last Name: ");
        pup.setLName(scan.nextLine());
        System.out.println("Enter Your Pet's Name: ");
        pup.setPetName(scan.nextLine());
        pup.toString();
    }//end of main method
}//end of VetDriver class
