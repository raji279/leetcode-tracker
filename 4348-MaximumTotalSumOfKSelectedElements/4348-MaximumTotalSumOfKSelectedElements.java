// Last updated: 7/9/2026, 10:08:17 AM
import java.util.Arrays;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int current = mul;
        for(int i = nums.length - 1;i>=nums.length-k;i--){
            long normal = nums[i];
            long multiply = 1L * nums[i]*current;
            ans += Math.max(normal,multiply);
            current--;
        }
        return ans;
    }
}