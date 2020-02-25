
/**
 *
 * @author Abdić
 */
public class Debt {

    private double balance;
    private final double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        balance = balance * interestRate;
    }
}
