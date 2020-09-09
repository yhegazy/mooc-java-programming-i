import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcase;
    private int maxWeight = 0;
    
    public Hold(int maxweight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxweight;
    }
    
    public int suitcaseWeight(){

        int weight = 0;

        for(Suitcase e: suitcase){
            weight +=e.totalWeight();
        }

        return weight;
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + suitcaseWeight() <= maxWeight){
            this.suitcase.add(suitcase);
        }
    }

    public String toString(){
        if(this.suitcase.isEmpty()){
            return "no suitcases (0 kg)";
        }
        
         if(this.suitcase.size() == 1){
            return "1 suitcase (" + this.suitcaseWeight() + " kg)";
        }
        
         return this.suitcase.size() + " suitcases (" +  this.suitcaseWeight() + " kg)";
    }
   
    
    public void printItems(){
        for(Suitcase e: suitcase){
            e.printItems();
        }
    }
}
