public class Minimumnum{


    static int minDeletions(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Initialize the dp array
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

      
        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        
        return n - dp[0][n - 1];
    }

    public static void main(String[] args) {
        String input = "abcba";
        int deletions = minDeletions(input);
        System.out.println("Minimum number of deletions: " + deletions);
    }
}
