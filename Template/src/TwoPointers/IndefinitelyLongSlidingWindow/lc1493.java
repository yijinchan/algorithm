package TwoPointers.IndefinitelyLongSlidingWindow;

public class lc1493 {
    public int longestSubarray(int[] nums) {
        int res = 0, n = nums.length;
        int sum = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum < r - l) {
                sum -= nums[l++];
            }

            res = Math.max(res, r - l);
        }

        return res;
    }
}
