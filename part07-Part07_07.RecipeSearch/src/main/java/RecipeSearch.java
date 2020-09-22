
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeBook recipeList = new RecipeBook();
        
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try (Scanner input = new Scanner(Paths.get(file))){
            ArrayList<String> items = new ArrayList<>();

            while (input.hasNextLine()) {
                String row = input.nextLine();
              
                if(row.trim().isEmpty() || !input.hasNextLine()){
                    String name = items.get(0);
                    int cookingTime = Integer.valueOf(items.get(1));
     
                    ArrayList<String> ingredients = new ArrayList<>();

                    for (int i = 2; i < items.size(); i++){
                        ingredients.add(items.get(i));
                    }

                    recipeList.addRecipe(new Recipe(name, cookingTime, ingredients));

                    items.removeAll(items);
                } else {
                    items.add(row);
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        UserInterface ui = new UserInterface(scanner, recipeList);

        ui.start();
        scanner.close();
    }
}
