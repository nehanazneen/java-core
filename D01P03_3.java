
import java.util.Scanner;

public class D01P03_3 {
    public static void main(String[] args) {
        float[] marks = new float[8];
        float sum = 0, avg;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks Obtained: ");
        for (int i = 0; i < 3; i++) {
            marks[i] = scan.nextFloat();
            sum += marks[i];
        }

        avg = sum / 3;

        System.out.print("\nGrade = ");
        if (avg >= 60)
            System.out.println("A");
        else if (avg >= 40 && avg < 60)
            System.out.println("B");
        else if (avg >= 35 && avg < 40)
        System.out.println("C");
        else 
            System.out.println("Fail");
    }
}
