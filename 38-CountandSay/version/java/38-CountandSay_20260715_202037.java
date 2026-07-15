// Last updated: 7/15/2026, 8:20:37 PM
1class Solution {
2    public int mySqrt(int x) {
3
4        if (x == 0 || x == 1)
5            return x;
6
7        int left = 1;
8        int right = x;
9        int ans = 0;
10
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13
14            long square = (long) mid * mid;
15
16            if (square == x) {
17                return mid;
18            } else if (square < x) {
19                ans = mid;
20                left = mid + 1;
21            } else {
22                right = mid - 1;
23            }
24        }
25
26        return ans;
27    }
28}