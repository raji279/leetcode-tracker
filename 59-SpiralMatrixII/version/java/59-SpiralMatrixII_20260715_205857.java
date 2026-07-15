// Last updated: 7/15/2026, 8:58:57 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3
4        int m = word1.length();
5        int n = word2.length();
6
7        int[][] dp = new int[m + 1][n + 1];
8
9        // Base cases
10        for (int i = 0; i <= m; i++)
11            dp[i][0] = i;
12
13        for (int j = 0; j <= n; j++)
14            dp[0][j] = j;
15
16        // Fill DP table
17        for (int i = 1; i <= m; i++) {
18            for (int j = 1; j <= n; j++) {
19
20                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
21                    dp[i][j] = dp[i - 1][j - 1];
22                } else {
23                    dp[i][j] = 1 + Math.min(
24                            dp[i - 1][j - 1],
25                            Math.min(dp[i - 1][j], dp[i][j - 1])
26                    );
27                }
28            }
29        }
30
31        return dp[m][n];
32    }
33}