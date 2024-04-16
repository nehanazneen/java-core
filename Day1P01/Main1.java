package Day1;


    // Constructors, getters, and setters



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the beans
        Product battery = (Product) context.getBean("battery");
        Product disc = (Product) context.getBean("disc");

        // Print out the beans
        System.out.println("Battery: " + battery);
        System.out.println("Disc: " + disc);

        // Close the context
        context.close();
    }
}

