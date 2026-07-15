// Last updated: 7/15/2026, 8:33:25 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        boolean[] visited = new boolean[nums.length];
7
8        backtrack(nums, visited, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    private void backtrack(int[] nums, boolean[] visited,
14                           List<Integer> current,
15                           List<List<Integer>> result) {
16
17        if (current.size() == nums.length) {
18            result.add(new ArrayList<>(current));
19            return;
20        }
21
22        for (int i = 0; i < nums.length; i++) {
23            if (visited[i]) {
24                continue;
25            }
26
27            visited[i] = true;
28            current.add(nums[i]);
29
30            backtrack(nums, visited, current, result);
31
32            current.remove(current.size() - 1);
33            visited[i] = false;
34        }
35    }
36}