package RedBook.summer2024_3_24;

import java.util.Scanner;


public class Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        if (n == 2) {
            for (long x : arr) {
                if (x != max) {
                    System.out.println(-1);
                } else {
                    System.out.println(sum);
                }
            }
        } else {
            for (long x : arr) {
                if(x == max){
                    System.out.println(sum);
                    continue;
                }
                long l = max, r = (long) 1e14;
                while (l < r) {
                    long mid = l + r >> 1;
                    if (mid - x <= (n - 1) * mid - (sum - x) + 1) {
                        r = mid;
                    } else {
                        l = mid + 1;
                    }
                }
                System.out.println(sum + (l - x) * 2 - 1);
            }
        }
    }
}
