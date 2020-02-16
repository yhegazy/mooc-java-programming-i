
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int number = scanner.nextInt();

        System.out.println("Where from?");
        int secondNumber = scanner.nextInt();

        for (int i = secondNumber; i <= number; i++) {
            System.out.println(i);
        }
    }
}
