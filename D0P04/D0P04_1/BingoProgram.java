
import java.util.Scanner;

public class BingoProgram {
    public static void main(String[] args) {
        // Initialize the array with 5 random numbers in the range from 1 to 40
        int[] array = {12, 25, 6, 33, 40};

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers in the range from 1 to 40:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Check if both numbers are present in the array
        boolean foundNum1 = false;
        boolean foundNum2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                foundNum1 = true;
            }
            if (array[i] == num2) {
                foundNum2 = true;
            }
        }

        // Display the result
        if (foundNum1 && foundNum2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Not found in the array");
        }
    }
}
