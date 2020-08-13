import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();  
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        int i = 0;
        
        try (Scanner input = new Scanner(Paths.get(file))){
            while (input.hasNextLine()) {
                String row = input.nextLine();
                if(!row.contains(searchedFor)){
                    continue;
                }
                
                i++;
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if(i != 0){
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
     
        
       

        scanner.close();

    }
}
