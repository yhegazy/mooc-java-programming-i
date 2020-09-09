
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> item;
    private int maximumweight = 0;
    
    public Suitcase(int maximumWeight){
        this.item = new ArrayList<>();
        this.maximumweight = maximumWeight;
    }
      
    public int totalWeight(){

        int weight = 0;

        for(Item e: item){
            weight +=e.getWeight();
        }

        return weight;
    }
    public void addItem(Item item){
        if (totalWeight() + item.getWeight() <= maximumweight){
            this.item.add(item);
        }               
    }
    public String toString(){

        if(this.item.isEmpty()){
            return "no items (0 kg)";
        }
        
        if(this.item.size() == 1){
            return "1 item (" + this.totalWeight() + " kg)";
        }
        return this.item.size() + " items ("  + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for(int i=0; i < this.item.size(); i++){
            System.out.println(this.item.get(i));
        }       
    }
    
    public Item heaviestItem(){
        if(this.item.isEmpty()){
            return null;
        }
   
        Item heaviest = this.item.get(0);
        
        for(Item e: this.item){
            if(e.getWeight() > heaviest.getWeight()){
                heaviest = e;
            }
        }
        
        return heaviest;
    }
    
}
