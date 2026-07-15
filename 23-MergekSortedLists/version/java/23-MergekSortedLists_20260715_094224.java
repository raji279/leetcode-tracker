// Last updated: 7/15/2026, 9:42:24 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Handle overflow case
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        // Determine sign
10        boolean negative = (dividend < 0) ^ (divisor < 0);
11
12        // Convert to long to avoid overflow
13        long dvd = Math.abs((long) dividend);
14        long dvs = Math.abs((long) divisor);
15
16        int result = 0;
17
18        while (dvd >= dvs) {
19
20            long temp = dvs;
21            int multiple = 1;
22
23            while (dvd >= (temp << 1)) {
24                temp <<= 1;
25                multiple <<= 1;
26            }
27
28            dvd -= temp;
29            result += multiple;
30        }
31
32        return negative ? -result : result;
33    }
34}