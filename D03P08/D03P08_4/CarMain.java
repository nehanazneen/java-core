package day3;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

  
 
    public String toString() {
        return name + " " + price;
    }

  
    public int hashCode() {
        return Objects.hash(name, price);
    }

   
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car otherCar = (Car) obj;
        return Double.compare(otherCar.price, price) == 0 && Objects.equals(name, otherCar.name);
    }

   
    public int compareTo(Car otherCar) {
        return Double.compare(price, otherCar.price);
    }
}

public class CarMain {
    public static void main(String[] args) {
                Car bugatti = new Car("Bugatti", 80050.0);
        Car swift = new Car("Swift", 305000.0);
        Car audi = new Car("Audi", 600100.0);
        Car benz = new Car("Benz", 900000.0);

                TreeMap<Car, Double> carDetails = new TreeMap<>();
        carDetails.put(bugatti, bugatti.price);
        carDetails.put(swift, swift.price);
        carDetails.put(audi, audi.price);
        carDetails.put(benz, benz.price);

                for (Map.Entry<Car, Double> entry : carDetails.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
