import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class


        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            
            System.out.println("Title: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int number = Integer.valueOf(scanner.nextLine());  

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());  

            books.add(new Books(name, number, year));
        }
        
        
        while(true) {
            System.out.print("What information will be printed? ");
            String search = scanner.nextLine();
          
            for (Books item : books) {
                if(search.equals("everything")){
                    System.out.println(item.getTitle() + ", " + item.getNumberOfPages() + " pages, " + item.getPublicationYear());
                } else if (search.equals("name")){
                    System.out.println(item.getTitle());
                }  
            }
            break;
        }
    }
}