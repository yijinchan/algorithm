package Ctrip.SummerInternship2024_3_13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 塔子哥拿到了一个数组，他每次操作可以任选一个元素加1或者减1。他想知道，将所有元素都变成和ai相等
 * 需要操作最少多少次
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = a.clone();
        Arrays.sort(b);
        long[] preSum = new long[n + 1];
        long[] sufSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + b[i - 1];
            sufSum[n - i] = sufSum[n - i + 1] + b[n - i];
        }
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = (l + r + 1) / 2;
                if (a[i] < b[mid]) {
                    r = mid - 1;
                } else {
                    l = mid;
                }
            }
            long res = (long) (l + 1) * a[i] - preSum[l + 1] + sufSum[l + 1] - (long) (n - l - 1) * a[i];
            System.out.println(res);
        }
    }
}