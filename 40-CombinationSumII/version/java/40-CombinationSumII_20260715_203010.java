// Last updated: 7/15/2026, 8:30:10 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3
4        if (num1.equals("0") || num2.equals("0"))
5            return "0";
6
7        int m = num1.length();
8        int n = num2.length();
9
10        int[] result = new int[m + n];
11
12        for (int i = m - 1; i >= 0; i--) {
13            for (int j = n - 1; j >= 0; j--) {
14
15                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
16
17                int p1 = i + j;
18                int p2 = i + j + 1;
19
20                int sum = mul + result[p2];
21
22                result[p2] = sum % 10;
23                result[p1] += sum / 10;
24            }
25        }
26
27        StringBuilder sb = new StringBuilder();
28
29        for (int num : result) {
30            if (!(sb.length() == 0 && num == 0)) {
31                sb.append(num);
32            }
33        }
34
35        return sb.toString();
36    }
37}