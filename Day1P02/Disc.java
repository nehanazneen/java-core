package Day1;

public class Disc extends Product {
    private int capacity;

    public Disc(int productId, String productName, double price, int capacity) {
        super(productId, productName, price);
        this.capacity = capacity;
    }

    // Getters and setters
}
