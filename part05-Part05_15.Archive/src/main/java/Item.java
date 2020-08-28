public class Item {
    private String name;
    private String identifier;
    
    public Item(String identifier, String name){
        this.name = name;
        this.identifier = identifier;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item comparedItem = (Item) compared;
        

        return this.identifier.equals(comparedItem.identifier);
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
