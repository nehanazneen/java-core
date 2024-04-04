
import java.util.Scanner;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();

        int result = longestPrefixSuffix(s);
        System.out.println("The length of the longest suffix and prefix is: " + result);
    }

    public static int longestPrefixSuffix(String str) {
        int n = str.length();
        if (n < 2) {
            return 0;
        }

        int len = 0;
        int i = 0;
        while (i < n / 2) {
            int j1 = 0, j2 = (n - 1) - i;
            int isPrefixSuffix = 1;

            while (j1 <= i) {
                if (str.charAt(j1) != str.charAt(j2)) {
                    isPrefixSuffix = 0;
                }
                j1++;
                j2++;
            }

            if (isPrefixSuffix == 1) {
                len = i + 1;
            }
            i++;
        }

        return len;
    }
}
