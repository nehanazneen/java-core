import java.util.Scanner;

public class SplitString {
    public static boolean canSplitIntoFourDistinctStrings(String s) {
        
        if (s.length() >= 10) {
            return true;
        }
for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
      if (!s1.equals(s2) && !s1.equals(s3) && !s1.equals(s4)
                            && !s2.equals(s3) && !s2.equals(s4) && !s3.equals(s4)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (canSplitIntoFourDistinctStrings(input)) {
            System.out.println("Yes, the string can be split into four distinct strings.");
        } else {
            System.out.println("No, the string cannot be split into four distinct strings.");
        }
    }
}
