// Last updated: 7/15/2026, 8:35:08 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permuteUnique(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(nums);
8        boolean[] visited = new boolean[nums.length];
9
10        backtrack(nums, visited, new ArrayList<>(), result);
11
12        return result;
13    }
14
15    private void backtrack(int[] nums, boolean[] visited,
16                           List<Integer> current,
17                           List<List<Integer>> result) {
18
19        if (current.size() == nums.length) {
20            result.add(new ArrayList<>(current));
21            return;
22        }
23
24        for (int i = 0; i < nums.length; i++) {
25
26            if (visited[i])
27                continue;
28
29            // Skip duplicates
30            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
31                continue;
32
33            visited[i] = true;
34            current.add(nums[i]);
35
36            backtrack(nums, visited, current, result);
37
38            current.remove(current.size() - 1);
39            visited[i] = false;
40        }
41    }
42}