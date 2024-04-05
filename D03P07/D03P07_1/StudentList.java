
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
      
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Jack");
        studentNames.add("Paul");
        studentNames.add("Henry");
        studentNames.add("Mary");
        studentNames.add("Ronaldo");
        studentNames.add("Henry"); 
 String searchName = "Henry";
        if (studentNames.contains(searchName)) {
            System.out.println("Output: Found");
        } else {
            System.out.println("Output: Not Found");
        }
    }
}
