# Last updated: 7/9/2026, 10:08:57 AM
class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        nums = sorted(nums1 + nums2)
        n = len(nums)

        if n % 2 == 1:
            return float(nums[n // 2])
        else:
            return (nums[n // 2 - 1] + nums[n // 2]) / 2.0
        