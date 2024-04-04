import java.util.Scanner;

public class RelpaceSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Replace spaces with '%20'
        String replacedString = replaceSpaces(input);
        
        // Output the replaced string
        System.out.println("String with spaces replaced: " + replacedString);
    }
    
    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                // If the character is a space, append '%20' to the StringBuilder
                sb.append("%20");
            } else {
                // Otherwise, append the character itself
                sb.append(c);
            }
        }
        
        // Convert the StringBuilder back to a String
        return sb.toString();
    }
}
