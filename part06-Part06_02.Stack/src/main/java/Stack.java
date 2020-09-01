import java.util.ArrayList;

public class Stack {
    private ArrayList<String> value;

    public Stack() {
        this.value = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.value.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.value.add(value);
    }
    
    public ArrayList<String> values(){
        return this.value;
    }
    
    public String take(){

        int i = this.values().size() -1;
    
        if(i > 0){
            return this.values().remove(i);
        }
        
        return this.values().remove(0); 
    }    
    
}
