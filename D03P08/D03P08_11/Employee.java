import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;


    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

   
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    
    public int hashCode() {
        return id; 
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id == other.id;
    }

    public static void main(String[] args) {
                Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

                Employee emp1 = new Employee(1001, "Daniel", "L&D", "Analyst");
        Employee emp2 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee emp3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee emp4 = new Employee(1004, "Grace", "HR", "Tech Support");

                employeeTable.put(emp1.hashCode(), emp1);
        employeeTable.put(emp2.hashCode(), emp2);
        employeeTable.put(emp3.hashCode(), emp3);
        employeeTable.put(emp4.hashCode(), emp4);

                int inputId = 1005;
        Employee charles = new Employee(inputId, "Charles", "Testing", "QA Lead");
        employeeTable.put(charles.hashCode(), charles);

                System.out.println("Employee details:");
        employeeTable.values().forEach(System.out::println);
    }
}
