import java.util.ArrayList;

public class GradingStatistics {
    private ArrayList<Integer> grades;
    private int score;

    public GradingStatistics(){
        this.grades = new ArrayList<>();
    }

    public ArrayList addScore(int score){
        if(score >= 0 && score <= 100){
            this.grades.add(score);
        }
        return grades;
    }

    public int getScore(){
        return this.score;
    }

    public void averageOfGrades(){
        double average;
        int sum = 0;
        
        for(Integer number : grades){
            if(number >= 0 && number <= 100){
                sum += number;
            }
        }

        average = (double) sum / this.grades.size();
        System.out.println("Point average (all): " + average);
        
    }

    public void passingOfGrades(){
        double average;
        int countAsPassing = 0;
        int sum   = 0;

        for(Integer number : grades){
            if (number > 49 && number <= 100){
                sum += number;
                countAsPassing++;
            }
        }

        if(countAsPassing > 0){
            average = (double) sum / countAsPassing;
            System.out.println("Point average (passing):" + average);
        } else{
            System.out.println("Point average (passing):-");
        }
        
    }

    public double passPercentage(){
        int countAsPassing    = 0;
        double passPercentage = 0.0;

        for(Integer number : grades){
            if (number > 49 && number <= 100){
                countAsPassing++;
            }

            passPercentage = 100 * (double) countAsPassing / grades.size();
        }

        return passPercentage;
    }

    public void distribution(){
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        star(countDistribution(90, 100));
        System.out.print("4: ");
        star(countDistribution(80, 89));
        System.out.print("3: ");
        star(countDistribution(70, 79));
        System.out.print("2: ");
        star(countDistribution(60, 69));
        System.out.print("1: ");
        star(countDistribution(50, 59));
        System.out.print("0: ");
        star(countDistribution(0, 49));
    }

    public int countDistribution(int lowLimit, int highLimit) {
        int count = 0;
        for(Integer number : grades){
            if(number >= lowLimit && number <= highLimit){
                count++;
            }
        }
        return count;
    }

    public static void star(int count) {
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

}