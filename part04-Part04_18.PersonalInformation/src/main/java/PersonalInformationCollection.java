
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            
            System.out.println("First name: ");
            String firstName = input.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String lastName = input.nextLine();

            System.out.println("Identification number: ");
            String identificationNumber = input.nextLine();

            
          
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }
        
        for (PersonalInformation item : infoCollection) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }
        
    }
}
