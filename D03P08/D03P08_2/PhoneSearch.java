package day3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneSearch {
    public static void main(String[] args) {
                Map<String, String> phoneBook = new HashMap<>();

                phoneBook.put("Joseph", "78822211137");
        phoneBook.put("Alice", "1234567890");
        phoneBook.put("Bob", "9876543210");
        phoneBook.put("Eve", "5551234567");
        phoneBook.put("Grace", "9990001111");

                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();

                String phoneNumber = phoneBook.get(searchName);

                if (phoneNumber != null) {
            System.out.println("Phone number for " + searchName + ": " + phoneNumber);
        } else {
            System.out.println("No phone number found for " + searchName);
        }
    }
}
