import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if(word.equals("stop")){
                break;
           
            } else if(word.equals("add")){
                System.out.println("To add: ");
                String input = scanner.nextLine();   
                todoList.add(input);
                
            } else if(word.equals("list")){
                todoList.print();
            } else if (word.equals("remove")){
                System.out.println("Which one is removed?");
                int input = Integer.valueOf(scanner.nextLine());
                todoList.remove(input);
            }
        }      
    }
}