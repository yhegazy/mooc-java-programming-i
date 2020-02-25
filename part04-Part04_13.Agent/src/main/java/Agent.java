
public class Agent {

    private final String firstName;
    private final String lastName;

    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }

//    public void print() {
//        System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
//    }
    @Override
    public String toString() {
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
}
