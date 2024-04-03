
import java.util.Scanner;

public class D01P03_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.printf("Factorial of %d is %d%n", num, factorial);
    }
}
