import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeBook recipeList;

    public UserInterface(Scanner scanner, RecipeBook recipeList){
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start(){
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop = stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipe by cooking time");
        System.out.println("find ingredient - searches recipe by ingredient");
    
        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")){
                break;
            }
            else if(command.equals("list")){
                System.out.println("Recipes: ");
                recipeList.printRecipeBook();
            } 
            else if(command.equals("find name")){
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                
                System.out.println("Recipes: ");
                recipeList.printByName(searchedWord);
            }
            else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxCookingTime = scanner.nextInt();
                
                System.out.println("Recipes: ");
                recipeList.printCookingTime(maxCookingTime);
            }
            else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                
                System.out.println("Recipes: ");
                recipeList.printIngredient(ingredient);
            }
        }
    }


    
}
