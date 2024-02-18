package DFS.subset;

import java.util.Scanner;

public class P1017 {

    private static int n;
    private static String res = "";
    private static final int[] w = {9,8,7,6,5,4,3,2,1};

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n > 45){
            System.out.println(-1);
        } else {
            dfs(0,0,"");
            System.out.println(res);
        }
    }
    private static void dfs(int u,int sum,String s){
        //边界条件
        if(u == 9){
            if(sum == n){
                if(res.length() < s.length() || (res.length() == s.length() && res.compareTo(s) < 0)){
                    res = s;
                }
            }
            return;
        }
        //不选
        dfs(u + 1,sum,s);
        //选
        dfs(u + 1,sum + w[u],s + w[u]);
    }
}
