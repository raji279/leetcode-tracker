// Last updated: 7/15/2026, 8:44:45 PM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
6
7        List<int[]> result = new ArrayList<>();
8
9        for (int[] interval : intervals) {
10            if (result.isEmpty() ||
11                result.get(result.size() - 1)[1] < interval[0]) {
12
13                result.add(interval);
14            } else {
15                result.get(result.size() - 1)[1] =
16                    Math.max(result.get(result.size() - 1)[1], interval[1]);
17            }
18        }
19
20        return result.toArray(new int[result.size()][]);
21    }
22}