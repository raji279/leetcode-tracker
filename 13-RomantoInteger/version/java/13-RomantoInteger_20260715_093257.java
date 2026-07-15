// Last updated: 7/15/2026, 9:32:57 AM
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> fourSum(int[] nums, int target) {
6
7        List<List<Integer>> result = new ArrayList<>();
8
9        Arrays.sort(nums);
10
11        int n = nums.length;
12
13        for (int i = 0; i < n - 3; i++) {
14
15            // Skip duplicate first element
16            if (i > 0 && nums[i] == nums[i - 1])
17                continue;
18
19            for (int j = i + 1; j < n - 2; j++) {
20
21                // Skip duplicate second element
22                if (j > i + 1 && nums[j] == nums[j - 1])
23                    continue;
24
25                int left = j + 1;
26                int right = n - 1;
27
28                while (left < right) {
29
30                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
31
32                    if (sum == target) {
33
34                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
35
36                        left++;
37                        right--;
38
39                        // Skip duplicate third element
40                        while (left < right && nums[left] == nums[left - 1])
41                            left++;
42
43                        // Skip duplicate fourth element
44                        while (left < right && nums[right] == nums[right + 1])
45                            right--;
46
47                    } else if (sum < target) {
48                        left++;
49                    } else {
50                        right--;
51                    }
52                }
53            }
54        }
55
56        return result;
57    }
58}