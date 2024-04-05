
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

    
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

  
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

   
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

  
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Main {
    public static void main(String[] args) {
      
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "Alice", 22, 1500.0));
        personSet.add(new Person(2, "Bob", 28, 2500.0));
        personSet.add(new Person(3, "Charlie", 30, 1800.0));
        personSet.add(new Person(4, "David", 19, 1200.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));

  
        for (Person person : personSet) {
            if (((Object) person).getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}
