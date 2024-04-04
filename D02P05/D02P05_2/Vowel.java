
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        System.out.print("Enter the number of vowels to count: ");
        int n = scanner.nextInt();

        int vowelCount = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
                if (vowelCount == n) {
                    break; 
                }
            }
        }

        if (vowelCount == n) {
            System.out.println("Output: " + input.substring(input.length() - n));
        } else {
            System.out.println("Mismatch in Vowel Count");
        }
    }
    private static boolean isVowel(char ch) {
        return "aeiou".contains(String.valueOf(ch));
    }
}
