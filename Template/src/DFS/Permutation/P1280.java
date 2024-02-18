package DFS.Permutation;

import java.util.Scanner;

public class P1280 {
    private static final int N = 11;
    private static final int[] nums = new int[N];
    private static final boolean[] flag = new boolean[N];
    private static int m;
    private static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();
        if(n > check(m)){
            System.out.println(-1);
        }
        dfs(1);
    }
    private static void dfs(int j){
        if(j > m){
            if(--n == 0){
                for (int i = 1; i <= m; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        for(int i = 1;i <= m;i++){
            if(!flag[i]){
                nums[j] = i;
                flag[i] = true;
                dfs(j + 1);
                flag[i] = false;
            }
        }
    }
    private static int check(int m){
        int res = 1;
        for(int i = 1;i <= m;i++){
            res *= i;
        }
        return res;
    }
}
