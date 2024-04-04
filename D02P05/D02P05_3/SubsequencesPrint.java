import java.util.*;

public class SubsequencesPrint{
    public static void main(String[] args) {
        String input = "abc";
        printAllSubsequences(input);
    }

    public static void printAllSubsequences(String str) {
        int n = str.length();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subsequence.append(str.charAt(j));
                }
            }
            System.out.print(subsequence + " ");
        }
    }
}

