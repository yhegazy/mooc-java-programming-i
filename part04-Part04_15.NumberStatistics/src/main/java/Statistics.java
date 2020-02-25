
/**
 *
 * @author Abdić
 */
public class Statistics {

    private int count = 0;
    private int sum = 0;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        count = count + 1;
        sum = sum + number;

    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {

        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }
}
