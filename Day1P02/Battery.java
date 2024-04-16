package Day1;

public class Battery extends Product {
    private boolean rechargeable;

    public Battery(int productId, String productName, double price, boolean rechargeable) {
        super(productId, productName, price);
        this.rechargeable = rechargeable;
    }

    // Getters and setters
}

