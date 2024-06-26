
import java.util.Scanner;

public class D01P03{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = inputScanner.nextInt();

        String monthName = getMonthName(monthNumber);
        if (monthName.equals("Invalid month range")) {
            System.out.println("Invalid input");
        } else {
            System.out.println("" + monthName);
        }
    }

    public static String getMonthName(int monthNumber) {
        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month range";
        }
        return monthName;
    }
}
