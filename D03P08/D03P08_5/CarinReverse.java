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

public class CarinReverse {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

                carMap.put(new Car("Benz", 900000.0), "Luxury");
        carMap.put(new Car("Audi", 600100.0), "Sporty");
        carMap.put(new Car("Swift", 305000.0), "Compact");
        carMap.put(new Car("Bugatti", 80050.0), "Exotic");

   
        NavigableSet<Car> descendingSet = carMap.descendingKeySet();
        for (Car car : descendingSet) {
            System.out.println(car);
        }
    }
}
