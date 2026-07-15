// Last updated: 7/15/2026, 8:09:23 PM
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4        solve(board);
5    }
6
7    private boolean solve(char[][] board) {
8
9        for (int row = 0; row < 9; row++) {
10
11            for (int col = 0; col < 9; col++) {
12
13                if (board[row][col] == '.') {
14
15                    for (char num = '1'; num <= '9'; num++) {
16
17                        if (isValid(board, row, col, num)) {
18
19                            board[row][col] = num;
20
21                            if (solve(board))
22                                return true;
23
24                            board[row][col] = '.';
25                        }
26                    }
27
28                    return false;
29                }
30            }
31        }
32
33        return true;
34    }
35
36    private boolean isValid(char[][] board, int row, int col, char num) {
37
38        for (int i = 0; i < 9; i++) {
39
40          
41            if (board[row][i] == num)
42                return false;
43
44            if (board[i][col] == num)
45                return false;
46
47            
48            int r = 3 * (row / 3) + i / 3;
49            int c = 3 * (col / 3) + i % 3;
50
51            if (board[r][c] == num)
52                return false;
53        }
54
55        return true;
56    }
57}