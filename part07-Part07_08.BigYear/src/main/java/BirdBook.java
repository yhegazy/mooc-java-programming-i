import java.util.ArrayList;

public class BirdBook {

    private ArrayList<BirdDB> birds;
  
    public BirdBook() {
        this.birds = new ArrayList<>();
    }

    public void addBirdName(BirdDB name){
        this.birds.add(name);
    }

    public void addLatinBirdName(BirdDB latinName){
        this.birds.add(latinName);
        
    }

    public void addObservation(String name){ 
        int count = 0;
        for(BirdDB bird: this.birds){
            if(bird.getName().equals(name)){
                count++;
                bird.getCount(count);
            }
        }
    }

    public void printOneBird(String name){
        for (BirdDB bird: this.birds){
            if(bird.getName().equals(name)){
                System.out.println(bird.toString());
            }
        }
    }

    public void printAllBirds(){
        for (BirdDB b: this.birds){
            System.out.println(b.toString());
        }
    }
}
