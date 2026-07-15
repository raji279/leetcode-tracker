// Last updated: 7/15/2026, 8:54:55 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        // If starting cell is blocked
9        if (obstacleGrid[0][0] == 1)
10            return 0;
11
12        dp[0][0] = 1;
13
14        // Fill first column
15        for (int i = 1; i < m; i++) {
16            if (obstacleGrid[i][0] == 0)
17                dp[i][0] = dp[i - 1][0];
18        }
19
20        // Fill first row
21        for (int j = 1; j < n; j++) {
22            if (obstacleGrid[0][j] == 0)
23                dp[0][j] = dp[0][j - 1];
24        }
25
26        // Fill remaining cells
27        for (int i = 1; i < m; i++) {
28            for (int j = 1; j < n; j++) {
29
30                if (obstacleGrid[i][j] == 1) {
31                    dp[i][j] = 0;
32                } else {
33                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
34                }
35            }
36        }
37
38        return dp[m - 1][n - 1];
39    }
40}