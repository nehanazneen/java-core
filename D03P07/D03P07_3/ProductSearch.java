
import java.util.HashSet;

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

    public int hashCode() {
        return productId.hashCode();
    }

  
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product otherProduct = (Product) obj;
        return productId.equals(otherProduct.productId);
    }
}

public class ProductSearch {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

       
        Product product1 = new Product("P001", "Samsung Galaxy S21");
        Product product2 = new Product("P002", "Apple iPhone 13");
        Product product3 = new Product("P003", "Maruti Dezire"); // The input product
        Product product4 = new Product("P004", "Sony Bravia TV");

      
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);

     
        String searchProductId = "P003";
        boolean isProductFound = false;
        for (Product product : productSet) {
            if (product.getProductId().equals(searchProductId)) {
                isProductFound = true;
                break;
            }
        }

        if (isProductFound) {
            System.out.println("Product Found.");
        } else {
            System.out.println("Product Not Found ");
        }
    }
}
