import java.util.ArrayList;

public class RecipeBook {
    
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }

    public void printRecipeBook(){
        for (Recipe r: this.recipes){
            System.out.println(r);
        }
    }
   public void printByName(String searchedWord){
        for (Recipe r: this.recipes){
            if(r.getName().contains(searchedWord)){
                System.out.println(r);
            }
        }
    }
   
   public void printCookingTime(int cookingTime){
        for (Recipe r: this.recipes){
            if(r.getCookingTime() <= cookingTime){
                System.out.println(r);
            }
        }
    }
    public void printIngredient(String ingredient){
        for (Recipe r: this.recipes){
            if(r.getIngredients().contains(ingredient)){
                System.out.println(r);
            }
        }
    }
}