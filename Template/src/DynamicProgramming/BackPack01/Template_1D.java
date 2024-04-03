package DynamicProgramming.BackPack01;

import java.util.Scanner;

public class Template_1D {
    static final int N = 1010;
    static int[] v = new int[N];
    static int[] w = new int[N];
    static int[] dp = new int[N];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i = 1;i <= n;i++){
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        for(int i = 1;i <= n;i++){
            for(int j = m;j >= v[i];j--){
                dp[j] = Math.max(dp[j],dp[j - v[i]] + w[i]);
            }
        }
        System.out.print(dp[m]);
    }
}
