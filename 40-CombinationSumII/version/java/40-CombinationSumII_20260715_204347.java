// Last updated: 7/15/2026, 8:43:47 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int farthest = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6
7            if (i > farthest) {
8                return false;
9            }
10
11            farthest = Math.max(farthest, i + nums[i]);
12
13            if (farthest >= nums.length - 1) {
14                return true;
15            }
16        }
17
18        return true;
19    }
20}