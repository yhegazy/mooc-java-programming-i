import java.util.Scanner;

public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;
    
    public UserInterface(JokeManager joke, Scanner scanner){
        this.joke = joke;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if(command.equals("X")){
                break;
           
            } else if(command.equals("1")){
                System.out.println("Write the joke to be added: ");
                String input = scanner.nextLine();   
                this.joke.addJoke(input);

            } else if(command.equals("2")){
                System.out.println(this.joke.drawJoke());

            } else if (command.equals("3")){
                System.out.println("Printing the jokes. ");
                this.joke.printJokes();
            }
        }      
    }
}