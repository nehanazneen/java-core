
public class BookTitle {    private String title;
    private double price;

  
    public BookTitle(String title, double price) {
        this.title = title;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

  
    public void setTitle(String title) {
        this.title = title;
    }

 
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

   
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("Java Programming", 350.00);

       
        System.out.println(" " + myBook.getTitle());
        System.out.println(" " + myBook.getPrice());
    }
}
