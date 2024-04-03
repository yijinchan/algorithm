package lcHot100;

import java.util.Arrays;

public class lc416 {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        if(sum % 2 != 0) return false;
        sum /= 2;
        boolean[][] f = new boolean[n + 1][sum + 1];
        for(int i = 0;i < n;i++){
            f[i][0] = true;
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < sum + 1;j++){
                if(j < nums[i]) {
                    f[i + 1][j] = f[i][j];
                } else {
                    f[i + 1][j] = f[i][j - nums[i]] || f[i][j];
                }

            }
        }
        return f[n - 1][sum];
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(new lc416().canPartition(nums));
    }
}
