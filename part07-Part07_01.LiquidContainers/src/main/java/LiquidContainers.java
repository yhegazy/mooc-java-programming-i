
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;
          
        while (true) {
        
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.contains("add")){
                if(amount >= 0 && amount <= 100){
                    if(firstContainer <= 90){
                        firstContainer += amount;

                        if(firstContainer > 100){
                            firstContainer = 100;
                        }
                    }
                } else {
                    firstContainer = 100;
                }  
              } else if (command.contains("remove")){
                    if(secondContainer > 0){
                        if(secondContainer < amount){
                            firstContainer = secondContainer;
                            secondContainer = 0;
                        } else{
                            secondContainer -= amount;
                            firstContainer += amount;
                        }
    
                        if(firstContainer > 100){
                            firstContainer = 100;
                        }
                    }
                } else if (command.contains("move")){
                if(firstContainer > 0){
                    if(firstContainer < amount){
                        secondContainer = firstContainer;
                        firstContainer = 0;
                    } else{
                        firstContainer -= amount;
                        secondContainer += amount;
                    }
                
                    if (secondContainer > 100){
                        secondContainer = 100;
                    }

                }
            } 
        }
        scan.close();
    }
}
