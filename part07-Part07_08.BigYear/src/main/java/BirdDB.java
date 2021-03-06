public class BirdDB {
    private String name;
    private String latinName;
    private int observationCount = 0;

    public BirdDB(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public int getCount(int count){
        this.observationCount = this.observationCount + count;
        return this.observationCount;   
    }
    
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
}
