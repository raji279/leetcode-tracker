// Last updated: 7/15/2026, 8:12:15 PM
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> combinationSum(int[] candidates, int target) {
6
7        List<List<Integer>> result = new ArrayList<>();
8        backtrack(candidates, target, 0, new ArrayList<>(), result);
9        return result;
10    }
11
12    private void backtrack(int[] candidates, int target, int index,
13                           List<Integer> current, List<List<Integer>> result) {
14
15   
16        if (target == 0) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        
22        if (target < 0) {
23            return;
24        }
25
26        for (int i = index; i < candidates.length; i++) {
27
28            current.add(candidates[i]);
29
30            // Same element can be reused, so pass i
31            backtrack(candidates, target - candidates[i], i, current, result);
32
33            // Backtrack
34            current.remove(current.size() - 1);
35        }
36    }
37}