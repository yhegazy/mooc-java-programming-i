
/**
 *
 * @author Abdić
 */
public class Whistle {

    private final String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}
