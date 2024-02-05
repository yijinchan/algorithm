package BinarySearch;

/**
 * 1.在非递减数组中找到第一个大于等于x的数
 * 2.在非递减数组中找到第一个大于x的数
 *
 */
public class template {
    public int upperBound1(int[] nums, int x) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[l] < x) {
            return -1;
        } else {
            return l;
        }
    }
    public int upperBound2(int[] nums, int x) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (nums[l] > x) {
            return l;
        } else {
            return -1;
        }
    }

}
