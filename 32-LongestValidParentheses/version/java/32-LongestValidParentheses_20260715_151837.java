// Last updated: 7/15/2026, 3:18:37 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4        int m = s.length();
5        int n = p.length();
6
7        boolean[][] dp = new boolean[m + 1][n + 1];
8
9        dp[0][0] = true;
10
11        
12        for (int j = 2; j <= n; j++) {
13            if (p.charAt(j - 1) == '*') {
14                dp[0][j] = dp[0][j - 2];
15            }
16        }
17
18        for (int i = 1; i <= m; i++) {
19
20            for (int j = 1; j <= n; j++) {
21
22                char sc = s.charAt(i - 1);
23                char pc = p.charAt(j - 1);
24
25                // Direct match or '.'
26                if (pc == '.' || pc == sc) {
27                    dp[i][j] = dp[i - 1][j - 1];
28                }
29
30                // Handle '*'
31                else if (pc == '*') {
32
33                    // Zero occurrence
34                    dp[i][j] = dp[i][j - 2];
35
36                    char prev = p.charAt(j - 2);
37
38                    // One or more occurrences
39                    if (prev == '.' || prev == sc) {
40                        dp[i][j] = dp[i][j] || dp[i - 1][j];
41                    }
42                }
43            }
44        }
45
46        return dp[m][n];
47    }
48}