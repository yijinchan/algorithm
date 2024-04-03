package Weekly.R391;

public class Q3 {
    public long countAlternatingSubarrays(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        long res = 0;
        for (int j : dp) {
            res += j;
        }
        return res;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] nums = new int[]{0,0,0,1,1,0,1,0};
        System.out.println(q3.countAlternatingSubarrays(nums));
    }
}
