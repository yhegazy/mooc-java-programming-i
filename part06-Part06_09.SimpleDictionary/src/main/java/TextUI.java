
import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if(word.equals("end")){
                break;
           
            } else if(word.equals("add")){
                System.out.println("Word: ");
                String input = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(input, translation);
            
            } else if(word.equals("search")){
                System.out.println("To be translated: ");
                String input = scanner.nextLine();


                if(this.dictionary.translate(input) == null){
                    System.out.println("Word " + input + " was not found");
                } else {
                    System.out.println(this.dictionary.translate(input));
                }            

            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
              
    }
}

