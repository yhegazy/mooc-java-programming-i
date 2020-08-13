
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

         int i = 0;

        try (Scanner input = new Scanner(Paths.get(file))){
           
            while (input.hasNextLine()) {
                int row = Integer.valueOf(input.nextLine());
                
                if(row >= lowerBound && row <= upperBound){
                    i++;
                }
            }
           System.out.println("Numbers: " + i);

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        

        scanner.close();
    }

}
