package Biweekly.D123;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = Long.MIN_VALUE;
        long sum = 0;
        Map<Integer, Long> minS = new HashMap<>();
        for (int x : nums) {
            long s1 = minS.getOrDefault(x - k, Long.MAX_VALUE / 2);
            long s2 = minS.getOrDefault(x + k, Long.MAX_VALUE / 2);
            ans = Math.max(ans, sum + x - Math.min(s1, s2));
            minS.merge(x, sum, Math::min);
            sum += x;
        }
        return ans > Long.MIN_VALUE / 4 ? ans : 0;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] nums = {-1,3,2,4,5};
        int k = 3;
        System.out.println(q3.maximumSubarraySum(nums, k));
    }
}
