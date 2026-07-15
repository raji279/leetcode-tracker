// Last updated: 7/15/2026, 9:31:56 AM
1import java.util.*;
2
3class Solution {
4
5    List<String> result = new ArrayList<>();
6
7    String[] map = {
8        "",     // 0
9        "",     // 1
10        "abc",  // 2
11        "def",  // 3
12        "ghi",  // 4
13        "jkl",  // 5
14        "mno",  // 6
15        "pqrs", // 7
16        "tuv",  // 8
17        "wxyz"  // 9
18    };
19
20    public List<String> letterCombinations(String digits) {
21
22        if (digits.length() == 0)
23            return result;
24
25        backtrack(digits, 0, new StringBuilder());
26
27        return result;
28    }
29
30    private void backtrack(String digits, int index, StringBuilder current) {
31
32        if (index == digits.length()) {
33            result.add(current.toString());
34            return;
35        }
36
37        String letters = map[digits.charAt(index) - '0'];
38
39        for (char ch : letters.toCharArray()) {
40            current.append(ch);
41            backtrack(digits, index + 1, current);
42            current.deleteCharAt(current.length() - 1); // Backtrack
43        }
44    }
45}