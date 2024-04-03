package Ctrip.SummerInternship2024_3_28;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        //1.没有负偶数的情况
        boolean flag = true;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0 && arr[i] % 2 == 0) {
                flag = false;
                break;
            }
            ans += arr[i];
        }
        if (flag) {
            System.out.println(ans);
        } else {
            //2.有负偶数的情况
            boolean[] cache = new boolean[n];
            for (int i = 0; i < n; i++) {
                if(arr[i] < 0 && arr[i] % 2 == 0){
                    cache[i] = true;
                }
            }

        }
    }
}
