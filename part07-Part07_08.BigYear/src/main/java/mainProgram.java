import java.util.Scanner;

public class mainProgram {
    
    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdBook birdList = new BirdBook();
        
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();

            if(command.equals("Quit")){
                break;
            }
            else if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birdList.addBirdName(new BirdDB(name, latinName));
            }
            else if(command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();

                birdList.addObservation(name);
                
            }
            else if(command.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
            
                birdList.printOneBird(name);
            }
            else if(command.equals("All")){
                birdList.printAllBirds();
            }
        }    
        scan.close();   
    }
}
