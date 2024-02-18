package Biweekly.D124;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums ，如果 nums 至少 包含 2 个元素，你可以执行以下操作中的 任意 一个：
 * 选择 nums 中最前面两个元素并且删除它们。
 * 选择 nums 中最后两个元素并且删除它们。
 * 选择 nums 中第一个和最后一个元素并且删除它们。
 * 一次操作的 分数 是被删除元素的和。
 * 在确保 所有操作分数相同 的前提下，请你求出 最多 能进行多少次操作。
 * 请你返回按照上述要求 最多 可以进行的操作次数。
 * <p>
 * 区间DP 记忆化搜索 + 递归
 */
public class Q3 {
    private int[][] memo;
    private int[] nums;

    public int maxOperations(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        memo = new int[n][n];
        //删除前两个
        int ans1 = helper(2, n - 1, nums[0] + nums[1]);
        int ans2 = helper(0, n - 3, nums[n - 1] + nums[n - 2]);
        int ans3 = helper(1, n - 2, nums[0] + nums[n - 1]);
        return Math.max(ans1, Math.max(ans2, ans3)) + 1;
    }

    private int helper(int i, int j, int t) {
        for (int[] r : memo) {
            Arrays.fill(r, -1);
        }
        return dfs(i, j, t);
    }

    private int dfs(int i, int j, int t) {
        if (i >= j) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int ans = 0;
        if (nums[i] + nums[i + 1] == t) {
            ans = Math.max(ans, dfs(i + 2, j, t) + 1);
        }
        if (nums[j] + nums[j - 1] == t) {
            ans = Math.max(ans, dfs(i, j - 2, t) + 1);
        }
        if (nums[i] + nums[j] == t) {
            ans = Math.max(ans, dfs(i + 1, j - 1, t)+ 1) ;
        }
        return memo[i][j] = ans;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] nums = {3, 2, 1, 2, 3, 4};
        System.out.println(q3.maxOperations(nums));
    }
}
