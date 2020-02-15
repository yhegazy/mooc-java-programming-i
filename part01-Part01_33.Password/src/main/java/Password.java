
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String password = "Caput Draconis";

        System.out.println("Password?");
        String passTry = scan.nextLine();
        if (!passTry.contains(password)) {
            System.out.println("Off with you!");
        } else {
            System.out.println("Welcome!");
        }
    }
}
