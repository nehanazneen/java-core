package day3;


import java.util.Hashtable;
import java.util.Objects;

class Employee{
    private int id;
    private String name;
    private String department;
    private String designation;

    // Constructor
    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation + "]";
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return id == other.id;
    }

    public static void main(String[] args) {
        // Create a Hashtable to store employee details
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information for 4 employees
        Employee emp1 = new Employee(1001, "Alice", "Engineering", "Software Engineer");
        Employee emp2 = new Employee(1002, "Bob", "Marketing", "Marketing Manager");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Carol", "HR", "HR Specialist");

        // Add employees to the Hashtable
        employeeTable.put(emp1.id, emp1);
        employeeTable.put(emp2.id, emp2);
        employeeTable.put(emp3.id, emp3);
        employeeTable.put(emp4.id, emp4);

        // Search for a specific employee (Input: 1003)
        int searchId = 1003;
        Employee searchedEmployee = employeeTable.get(searchId);

        if (searchedEmployee != null) {
            System.out.println("Employee found:");
            System.out.println(searchedEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
