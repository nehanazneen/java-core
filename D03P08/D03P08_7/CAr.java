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

public class CAr {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

     
        Car benz = new Car("Benz", 900000.0);
        Car bugatti = new Car("Bugatti", 80050.0);
        Car ferrari = new Car("Ferrari", 200000.0);
        Car lamborghini = new Car("Lamborghini", 150000.0);

        carMap.put(benz, "Luxury");
        carMap.put(bugatti, "Super Sports");
        carMap.put(ferrari, "Sports");
        carMap.put(lamborghini, "Exotic");

                Car highestPriceCar = carMap.lastKey();
        Car lowestPriceCar = carMap.firstKey();

        System.out.println(highestPriceCar);
        System.out.println(lowestPriceCar);
    }
}
