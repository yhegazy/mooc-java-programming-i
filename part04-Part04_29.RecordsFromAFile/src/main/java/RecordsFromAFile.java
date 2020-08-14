import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String file = scanner.nextLine();
         
        
        try (Scanner input = new Scanner(Paths.get(file))){
            while (input.hasNextLine()) {
                String row = input.nextLine();

                String[] parts = row.split(",");

                String name = parts[0];
                int age = Integer.valueOf((parts[1]));


                if (age != 1) {
                    System.out.println(name +", age: " + age + " years");
                } else {
                    System.out.println(name +", age: " + age + " year");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();

    }
}
