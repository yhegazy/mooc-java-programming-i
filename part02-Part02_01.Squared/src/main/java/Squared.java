
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = (int) Math.pow(number, 2);

        System.out.println(result);
    }
}
