// Last updated: 7/15/2026, 9:00:08 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int col0 = 1;
7
8        // Step 1: Mark rows and columns
9        for (int i = 0; i < m; i++) {
10
11            if (matrix[i][0] == 0)
12                col0 = 0;
13
14            for (int j = 1; j < n; j++) {
15
16                if (matrix[i][j] == 0) {
17                    matrix[i][0] = 0;
18                    matrix[0][j] = 0;
19                }
20            }
21        }
22
23        // Step 2: Fill zeroes (bottom-up)
24        for (int i = m - 1; i >= 0; i--) {
25
26            for (int j = n - 1; j >= 1; j--) {
27
28                if (matrix[i][0] == 0 || matrix[0][j] == 0)
29                    matrix[i][j] = 0;
30            }
31
32            if (col0 == 0)
33                matrix[i][0] = 0;
34        }
35    }
36}