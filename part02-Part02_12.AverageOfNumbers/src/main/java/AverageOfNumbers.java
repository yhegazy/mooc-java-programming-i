
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number != 0) {
                i++;
                sum += number;
            } else if (number == 0) {
                break;
            }
        }
        System.out.println("Average of the numbers: " + ((double) sum / i));
    }
}
