import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GradingStatistics grade = new GradingStatistics();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter point totals, -1 stops:");
            
        while(true){
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);

            if(number == -1){
                break;
            }

            grade.addScore(number);
        }
 

        grade.averageOfGrades();
        grade.passingOfGrades();
        System.out.println("Pass percentage: " + grade.passPercentage());
        grade.distribution();
        scanner.close();
    }

}