
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
           
        while(true){
            String word = scanner.nextLine();
            if(word.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
