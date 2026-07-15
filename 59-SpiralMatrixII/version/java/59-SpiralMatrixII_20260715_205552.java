// Last updated: 7/15/2026, 8:55:52 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        dp[0][0] = grid[0][0];
9
10        // First column
11        for (int i = 1; i < m; i++) {
12            dp[i][0] = dp[i - 1][0] + grid[i][0];
13        }
14
15        // First row
16        for (int j = 1; j < n; j++) {
17            dp[0][j] = dp[0][j - 1] + grid[0][j];
18        }
19
20        // Fill remaining cells
21        for (int i = 1; i < m; i++) {
22            for (int j = 1; j < n; j++) {
23                dp[i][j] = grid[i][j] +
24                           Math.min(dp[i - 1][j], dp[i][j - 1]);
25            }
26        }
27
28        return dp[m - 1][n - 1];
29    }
30}