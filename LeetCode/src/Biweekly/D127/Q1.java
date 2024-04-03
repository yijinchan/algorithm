package Biweekly.D127;

public class Q1 {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int ans = 100;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if(x >= k) {
                ans = 1;
                break;
            }
            for (int j = i + 1; j < n; j++) {
                //枚举nums,按位或运算值大于K
                x |= nums[j];
                if(x >= k) {
                    ans = Math.min(ans, j - i + 1);
                }
            }
        }
        return ans == 100 ? -1 : ans;
    }
}
