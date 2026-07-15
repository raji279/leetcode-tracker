// Last updated: 7/15/2026, 8:28:09 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(candidates);
7
8        backtrack(candidates, target, 0, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    private void backtrack(int[] candidates, int target, int start,
14                           List<Integer> current, List<List<Integer>> result) {
15
16        if (target == 0) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        for (int i = start; i < candidates.length; i++) {
22
23            // Skip duplicates
24            if (i > start && candidates[i] == candidates[i - 1]) {
25                continue;
26            }
27
28           
29            if (candidates[i] > target) {
30                break;
31            }
32
33            current.add(candidates[i]);
34
35           
36            backtrack(candidates, target - candidates[i], i + 1, current, result);
37
38           
39            current.remove(current.size() - 1);
40        }
41    }
42}