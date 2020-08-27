
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }
    
        if (!(compared instanceof Person)) {
            return false;
        }

        Person person = (Person) compared;
        
        if (this.name == person.name &&
                this.birthday.getDay() == person.birthday.getDay()&&
                this.birthday.getMonth() == person.birthday.getMonth() &&
                this.birthday.getYear() == person.birthday.getYear() &&
                this.height == person.height &&
                this.weight == person.weight) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

}
