package Weekly.R388;

import java.util.Arrays;


public class Q2 {
    public long maximumHappinessSum(int[] happiness, int k) {
        //二分查找
        Arrays.sort(happiness);
        int n = happiness.length;
        int r = n - 1;
        int l = 0;
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (happiness[mid] < k - 1) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        long ans = 0;
        long cnt = 0;
        for (int i = n - 1; i > l + 1; i--) {
            ans += happiness[i];
            if(cnt <= k - 1) {
                ans -= cnt;
                cnt++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[] happiness = {1,1,1,1};
        int k = 2;
        System.out.println(q2.maximumHappinessSum(happiness, k));
    }
}
