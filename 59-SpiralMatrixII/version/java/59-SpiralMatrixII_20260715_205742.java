// Last updated: 7/15/2026, 8:57:42 PM
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5        Stack<String> stack = new Stack<>();
6
7        String[] parts = path.split("/");
8
9        for (String part : parts) {
10
11            if (part.equals("") || part.equals(".")) {
12                continue;
13            }
14
15            if (part.equals("..")) {
16                if (!stack.isEmpty()) {
17                    stack.pop();
18                }
19            } else {
20                stack.push(part);
21            }
22        }
23
24        if (stack.isEmpty()) {
25            return "/";
26        }
27
28        StringBuilder result = new StringBuilder();
29
30        for (String dir : stack) {
31            result.append("/").append(dir);
32        }
33
34        return result.toString();
35    }
36}