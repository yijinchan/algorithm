package DFS.Subset;

import java.util.Scanner;

public class acw92 {
    private static final int N = 20;
    private static int n;
    private static final boolean[] flag = new boolean[N];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        dfs(1);
    }
    private static void dfs(int u){
        if(u > n){
            for(int i = 1;i <= n;i++){
                if(flag[i]){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
        }
        //不选
        flag[u] = false;
        dfs(u + 1);
        //选
        flag[u] = true;
        dfs(u + 1);
    }
}
