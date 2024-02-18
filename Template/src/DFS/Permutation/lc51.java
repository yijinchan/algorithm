package DFS.Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc51 {
    List<List<String>> ans = new ArrayList<>();
    int[] col;
    int n;
    public List<List<String>> solveNQueens(int n) {
        col = new int[n];
        this.n = n;
        dfs(0);
        return ans;
    }
    private void dfs(int r){
        if(r == n){
            List<String> tmp = new ArrayList<>();
            for (int i : col) {
                char[] row = new char[n];
                Arrays.fill(row,'.');
                row[i] = 'Q';
                tmp.add(new String(row));
            }
            ans.add(tmp);
            return;
        }

        for(int c = 0; c < col.length; c++){
            if(valid(r,c)){
                col[r] = c;
                dfs(r + 1);
            }
        }
    }
    private boolean valid(int r,int c){
        for (int R = 0; R < r; R++) {
            int C = col[R];
            if((c == C) ||((R + C) == (r + c)) || ((R - C)==(r - c)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        lc51 obj = new lc51();
        List<List<String>> res = obj.solveNQueens(4);
        for (List<String> re : res) {
            for (String s : re) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
