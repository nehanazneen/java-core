package Sal;

import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

  
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

public class TotalSal {
    public static void main(String[] args) {
        // Create predefined information for 6 persons
        Person person1 = new Person(1, "Alice", 30, 4000.0);
        Person person2 = new Person(2, "Bob", 25, 3500.0);
        Person person3 = new Person(3, "Charlie", 28, 5000.0);
        Person person4 = new Person(4, "David", 22, 3000.0);
        Person person5 = new Person(5, "Eva", 35, 6000.0);
        Person person6 = new Person(6, "Frank", 27, 4000.0);

    
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        double totalSalary = personSet.stream().mapToLong(Person::getSalary).sum();

        
        System.out.println("Sum of all salaries: " + totalSalary);
    }
}
