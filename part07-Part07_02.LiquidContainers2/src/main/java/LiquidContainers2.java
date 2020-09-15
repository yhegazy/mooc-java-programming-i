
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("First:" + container.toString());
            System.out.println("Second:" + secondContainer.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equals("add")){
                container.add(amount);
            } else if (command.equals("remove")){
                secondContainer.remove(amount);
            } else if (command.equals("move")){
                if(container.contains() >= amount){
                    secondContainer.add(amount);
                    container.remove(amount);
                } else {
                    secondContainer.add(container.contains());
                    container.remove(container.contains());
                }
            }
        }
        
        scan.close();
    }

}
