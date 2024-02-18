package DFS.Permutation;

import java.util.Scanner;

public class acw94 {
    private static final int N = 10;
    private static final boolean[] flag = new boolean[N];
    private static final int[] nums = new int[N];
    private static int n;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        dfs(1);
    }

    private static void dfs(int j){
        if(j > n){
            for(int i = 1;i <= n;i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1;i <= n;i++){
            if(!flag[i]){
                nums[j] = i;
                flag[i] = true;
                dfs(j + 1);
                flag[i] = false;
            }
        }
    }
}
