
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                i++;
                sum += number;
            } else if (number == 0 && sum > 0) {
                System.out.println((double) sum / i);
                break;
            } else if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
        }
    }
}
