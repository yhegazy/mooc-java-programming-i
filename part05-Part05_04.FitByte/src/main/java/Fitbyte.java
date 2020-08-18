public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){  
        //age = 30
        //rHR = 60
        //percentage = .5
        //BPM = (mHR - rHR) * (tHR%) + rHR
        
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        
        return (maximumHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
    }
}
