import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cooking_time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.cooking_time = time;
        this.ingredients = ingredients;
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTime(){
        return this.cooking_time;
    }

    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cooking_time;  
    }
}
