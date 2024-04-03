package DFS.Subset;

import java.util.Scanner;

public class P1031 {
    private static int n,res;
    private static int[] array;
    private static int[] choose;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        res = Integer.MAX_VALUE;
        array = new int[n];
        choose = new int[3];
        for(int i = 0;i < n;i++){
            array[i] = scan.nextInt();
        }
        dfs(0);
        System.out.println(res);
    }
    private static void dfs(int u){
        if(u == n){
            if(choose[2] > choose[1] && choose[1] > choose[0]){
                res = Math.min(res,choose[2] - choose[0]);
            }
            return;
        }
        for(int i = 0;i < 3;i++) {
            choose[i] += array[u];
            dfs(u + 1);
            choose[i] -= array[u];
        }
    }
}
