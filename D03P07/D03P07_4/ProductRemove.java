import java.util.*;

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

public class ProductRemove {
    public static void main(String[] args) {
       
        Set<Product> productSet = new HashSet<>();

        
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Dezire"));
        productSet.add(new Product("P003", "Toyota Corolla"));
        productSet.add(new Product("P004", "Honda Civic"));

        
        String productIdToRemove = "P002";
        Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId().equals(productIdToRemove)) {
                iterator.remove();
                break;
            }
        }

       
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}
