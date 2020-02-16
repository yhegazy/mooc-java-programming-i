
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        long lastNumber = scanner.nextLong();
        long sum = 0;
        for (long i = 0; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
