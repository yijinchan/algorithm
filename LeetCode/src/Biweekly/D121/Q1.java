package Biweekly.D121;

import java.util.Arrays;

/**
 * 给你一个下标从 0 开始的整数数组 nums 。
 * 如果一个前缀 nums[0..i] 满足对于 1 <= j <= i 的所有元素都有 nums[j] = nums[j - 1] + 1 ，那么我们称这个前缀是一个 顺序前缀 。特殊情况是，只包含 nums[0] 的前缀也是一个 顺序前缀 。
 * 请你返回 nums 中没有出现过的 最小 整数 x ，满足 x 大于等于 最长 顺序前缀的和。
 */
public class Q1 {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int r = 0;
        while(r < n){
            sum += nums[r];
            if(r < n - 1 && nums[r] != nums[r+1] - 1){
                break;
            }
            r++;
        }
        Arrays.sort(nums);
        for(int i : nums){
            if(sum == i){
                sum = i + 1;
            }
        }
        return sum;
    }
}
