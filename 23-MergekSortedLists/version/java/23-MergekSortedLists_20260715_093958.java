// Last updated: 7/15/2026, 9:39:58 AM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3
4        int k = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7
8            if (nums[i] != val) {
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13
14        return k;
15    }
16}