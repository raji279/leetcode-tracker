// Last updated: 7/15/2026, 3:05:57 PM
1class Solution {
2
3    public int[] searchRange(int[] nums, int target) {
4
5        int first = findFirst(nums, target);
6        int last = findLast(nums, target);
7
8        return new int[]{first, last};
9    }
10
11    private int findFirst(int[] nums, int target) {
12
13        int left = 0;
14        int right = nums.length - 1;
15        int ans = -1;
16
17        while (left <= right) {
18
19            int mid = left + (right - left) / 2;
20
21            if (nums[mid] == target) {
22                ans = mid;
23                right = mid - 1;   // Continue searching left
24            } else if (nums[mid] < target) {
25                left = mid + 1;
26            } else {
27                right = mid - 1;
28            }
29        }
30
31        return ans;
32    }
33
34    private int findLast(int[] nums, int target) {
35
36        int left = 0;
37        int right = nums.length - 1;
38        int ans = -1;
39
40        while (left <= right) {
41
42            int mid = left + (right - left) / 2;
43
44            if (nums[mid] == target) {
45                ans = mid;
46                left = mid + 1;   
47            } else if (nums[mid] < target) {
48                left = mid + 1;
49            } else {
50                right = mid - 1;
51            }
52        }
53
54        return ans;
55    }
56}