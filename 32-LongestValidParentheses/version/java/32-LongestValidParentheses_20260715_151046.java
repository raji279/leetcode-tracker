// Last updated: 7/15/2026, 3:10:46 PM
1import java.util.*;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5
6        HashSet<String> set = new HashSet<>();
7
8        for (int i = 0; i < 9; i++) {
9
10            for (int j = 0; j < 9; j++) {
11
12                char num = board[i][j];
13
14                if (num == '.')
15                    continue;
16
17                String row = num + " in row " + i;
18                String col = num + " in col " + j;
19                String box = num + " in box " + (i / 3) + "-" + (j / 3);
20
21                if (!set.add(row) || !set.add(col) || !set.add(box)) {
22                    return false;
23                }
24            }
25        }
26
27        return true;
28    }
29}