
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        long number = scanner.nextLong();

        long factorial = 1;

        for (long i = 2; i <= number; i++) {
            factorial = i * factorial;
        }
        System.out.print("Factorial: " + factorial);
    }
}
