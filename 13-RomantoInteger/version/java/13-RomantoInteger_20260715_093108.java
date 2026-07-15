// Last updated: 7/15/2026, 9:31:08 AM
1import java.util.*;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5
6        Arrays.sort(nums);
7
8        int closest = nums[0] + nums[1] + nums[2];
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            int left = i + 1;
13            int right = nums.length - 1;
14
15            while (left < right) {
16
17                int sum = nums[i] + nums[left] + nums[right];
18
19                if (Math.abs(target - sum) < Math.abs(target - closest)) {
20                    closest = sum;
21                }
22
23                if (sum < target) {
24                    left++;
25                } else if (sum > target) {
26                    right--;
27                } else {
28                    return sum; // Exact match
29                }
30            }
31        }
32
33        return closest;
34    }
35}