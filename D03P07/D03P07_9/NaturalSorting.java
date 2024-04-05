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
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

 
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
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

public class NaturalSorting {
    public static void main(String[] args) {
     
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "John", 30, 5000.0));
        personSet.add(new Person(2, "Alice", 25, 6000.0));
        personSet.add(new Person(3, "Bob", 28, 5500.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "Emily", 24, 6200.0));
        personSet.add(new Person(6, "Kevin", 27, 5800.0));

        
        for (Person person : personSet) {
            if (person.name.startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
