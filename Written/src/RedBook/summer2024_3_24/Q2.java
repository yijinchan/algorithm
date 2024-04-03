package RedBook.summer2024_3_24;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static final int N = 110;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 1;k <= n;k++) {
            int[] tmp = new int[N];
            for (int i = 1; i <= n; i++) {
                tmp[i] = arr[i] / 2;
            }
            tmp[k] = arr[k];
            //前i个数中,总和为j的账号数量
            int[][] dp = new int[N][N];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[0],Integer.MAX_VALUE / 2);
            }
            dp[0][0] = 0;
            for (int i = 1; i <= n ; i++) {
                for (int j = 0; j <= x; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if(j >= tmp[i]) dp[i][j] = Math.min(dp[i - 1][j],dp[i - 1][j - tmp[i]] + 1);
                }
            }
            ans = Math.min(ans,dp[n][x]);
        }
        ans = ans == Integer.MAX_VALUE  / 2 ? -1 : ans;
        System.out.println(ans);
    }
}
