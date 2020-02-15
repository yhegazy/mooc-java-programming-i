
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");

        int year = Integer.parseInt(scan.nextLine());

        int x = year % 4;
        int y = year % 100;
        int z = year % 400;

        if (x == 0 && (y != 0 || z == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
