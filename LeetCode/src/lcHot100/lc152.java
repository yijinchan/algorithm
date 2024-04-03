package lcHot100;

public class lc152 {
    public int maxProduct(int[] nums) {
        int i, ret, pos, neg, temp;
        pos = nums[0];
        neg = nums[0];
        ret = nums[0];

        for (i = 1; i < nums.length; i++) {
            temp = pos;
            pos = Math.max(nums[i], Math.max(pos * nums[i], neg * nums[i]));
            neg = Math.min(nums[i], Math.min(temp * nums[i], neg * nums[i]));
            ret = Math.max(pos, ret);
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(new lc152().maxProduct(nums));
    }
}
