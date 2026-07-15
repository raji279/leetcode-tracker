// Last updated: 7/15/2026, 8:24:49 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int length = 0;
4        int i = s.length() - 1;
5
6        // Skip trailing spaces
7        while (i >= 0 && s.charAt(i) == ' ') {
8            i--;
9        }
10
11        
12        while (i >= 0 && s.charAt(i) != ' ') {
13            length++;
14            i--;
15        }
16
17        return length;
18    }
19}