// Last updated: 7/15/2026, 3:14:40 PM
1class Solution {
2    public int search(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11          
12            if (nums[mid] == target) {
13                return mid;
14            }
15
16          
17            if (nums[left] <= nums[mid]) {
18
19                if (target >= nums[left] && target < nums[mid]) {
20                    right = mid - 1;
21                } else {
22                    left = mid + 1;
23                }
24
25            }
26        
27            else {
28
29                if (target > nums[mid] && target <= nums[right]) {
30                    left = mid + 1;
31                } else {
32                    right = mid - 1;
33                }
34            }
35        }
36
37        return -1;
38    }
39}