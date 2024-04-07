package day3;


import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " " + price;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car otherCar = (Car) obj;
        return Double.compare(otherCar.price, price) == 0 &&
                Objects.equals(name, otherCar.name);
    }

    // Implement natural ordering based on price
    @Override
    public int compareTo(Car otherCar) {
        return Double.compare(this.price, otherCar.price);
    }
}

public class carNAme {
    public static void main(String[] args) {
        // Create a TreeMap to store Car details
        TreeMap<Car, String> carDetails = new TreeMap<>();

        // Add predefined car information
        carDetails.put(new Car("Bugatti", 80050.0), "Luxury");
        carDetails.put(new Car("Swift", 305000.0), "Compact");
        carDetails.put(new Car("Audi", 600100.0), "Premium");

        // Print the car details
        System.out.println("Car Details:");
        for (Map.Entry<Car, String> entry : carDetails.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }

        // Remove the greatest key
        Car greatestCar = carDetails.lastKey();
        carDetails.remove(greatestCar);
        System.out.println("\nRemoved greatest key: " + greatestCar);

        // Replace value mapped by specified key
        double newPrice = 80050.0;
        carDetails.put(greatestCar, "Reva");
        System.out.println("\nReplaced value for key " + greatestCar + " with new value: Reva " + newPrice);
    }
}
