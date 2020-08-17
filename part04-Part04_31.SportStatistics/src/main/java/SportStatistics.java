
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String search = scan.nextLine();

        int h = 0;
        int i = 0;
        int j = 0;

        try (Scanner input = new Scanner(Paths.get(file))){

            while (input.hasNextLine()) {
                String row = input.nextLine();

                String[] col = row.split(",");
                String team1 = col[0];
                String team2 = col[1];
                int score1 = Integer.valueOf(col[2]);
                int score2 = Integer.valueOf(col[3]);

                if(search.equals(team1) || search.equals(team2)){
                    h++;
                }

                if(search.equals(team1)){
                    if(score1 > score2){
                        i++;
                    } else {
                        j++;
                    }
                }
                if(search.equals(team2)){
                    if(score2 > score1){
                        i++;
                    } else {
                        j++;
                    }
                }              

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + h);
        System.out.println("Wins: " + i);
        System.out.println("Losses: " + j);

        scan.close();
    }
}