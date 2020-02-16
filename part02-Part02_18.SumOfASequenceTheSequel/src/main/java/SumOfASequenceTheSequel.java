
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        long number = scanner.nextInt();
        System.out.print("Last number: ");
        long secondNumber = scanner.nextInt();

        long sum = 0;
        for (long i = number; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.print("The sum is: " + sum);
    }
}
