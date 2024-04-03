package lcHot100;

public class lc189 {
    private int[] nums;

    public void rotate(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;
        k %= n;
        reverse(0, n - 1);
        reverse(0, k - 1);
        reverse(k, n - 1);
    }

    private void reverse(int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            int temp = nums[startIdx];
            nums[startIdx] = nums[endIdx];
            nums[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }

    public static void main(String[] args) {
        lc189 lc189 = new lc189();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        lc189.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
