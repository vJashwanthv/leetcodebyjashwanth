class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];

        // Filling the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtracking to build the SCS string
        int p = m, q = n;
        StringBuilder res = new StringBuilder();
        
        while (p > 0 && q > 0) {
            if (str1.charAt(p - 1) == str2.charAt(q - 1)) {
                res.append(str1.charAt(p - 1));
                p--;
                q--;
            } else if (dp[p - 1][q] > dp[p][q - 1]) {
                res.append(str1.charAt(p - 1));
                p--;
            } else {
                res.append(str2.charAt(q - 1));
                q--;
            }
        }

        // Append remaining characters from str1 and str2
        while (p > 0) {
            res.append(str1.charAt(p - 1));
            p--;
        }
        while (q > 0) {
            res.append(str2.charAt(q - 1));
            q--;
        }

        return res.reverse().toString();
    }
}
