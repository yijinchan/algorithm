package TwoPointers.IndefinitelyLongSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class zijie2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        Arrays.sort(w);

        int res = Integer.MAX_VALUE;
        for (int l = 0, r = 0, sum = 0; r < n; r++) {
            while (w[r] - w[l] + 1 > n) {
                l++;
            }
            res = Math.min(res, n - (r - l + 1));
        }
        System.out.println(res);
    }
}
