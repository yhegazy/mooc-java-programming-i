
/**
 *
 * @author Abdić
 */
public class Product {

    private final double price;
    private final int quantity;
    private final String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
