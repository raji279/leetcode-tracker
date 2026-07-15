// Last updated: 7/15/2026, 8:16:26 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        int i = m - 1;
5        int j = n - 1;
6        int k = m + n - 1;
7
8        while (i >= 0 && j >= 0) {
9            if (nums1[i] > nums2[j]) {
10                nums1[k] = nums1[i];
11                i--;
12            } else {
13                nums1[k] = nums2[j];
14                j--;
15            }
16            k--;
17        }
18
19        while (j >= 0) {
20            nums1[k] = nums2[j];
21            j--;
22            k--;
23        }
24    }
25}