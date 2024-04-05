
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
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

   
    public int hashCode() {
        return Objects.hash(id);
    }

   
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return id == other.id;
    }

    
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

public class PersonUpperCase {
    public static void main(String[] args) {
      
        Person person1 = new Person(1, "Jerry Smith", 30, 60000.0);
        Person person2 = new Person(2, "Popeye Jones", 28, 55000.0);
        Person person3 = new Person(3, "John", 35, 70000.0);
        Person person4 = new Person(4, "Tom", 25, 50000.0);

        // Store persons in TreeSet (sorted by id)
        Set<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);

        for (Person person : personSet) {
            System.out.println(person.Person.toUpperCase());
        }
    }
}
