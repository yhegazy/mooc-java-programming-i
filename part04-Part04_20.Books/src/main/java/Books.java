public class Books {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Books(String name, int number, int year){
        this.title = name;
        this.numberOfPages = number;
        this.publicationYear = year;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.numberOfPages + " (" + this.publicationYear + ")";
    }
}
