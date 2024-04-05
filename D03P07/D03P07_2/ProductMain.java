
import java.util.HashSet;
import java.util.Set;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

   
    public String toString() {
        return productId + " " + productName;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto k10"));

       
        System.out.println("Product Details:");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}
