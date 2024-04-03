package DynamicProgramming.BackPack01;

import java.util.Scanner;

public class Template_2D {
    static final int N = 1010;
    static int[] v = new int[N];
    static int[] w = new int[N];
    static int[][] dp = new int[N][N];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i = 1;i <= n;i++){
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        for(int i = 1;i <= n;i++){
            for(int j = 0;j <= m;j++){
                dp[i][j] = dp[i - 1][j];
                if(j >= v[i]) dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - v[i]] + w[i]);
            }
        }
        System.out.print(dp[n][m]);
    }
}
