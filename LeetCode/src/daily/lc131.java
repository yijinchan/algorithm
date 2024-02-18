package daily;

import java.util.ArrayList;
import java.util.List;

public class lc131 {
    private final List<List<String>> ans = new ArrayList<>();
    private final List<String> path = new ArrayList<>();
    private String s;
    public List<List<String>> partition(String s) {
        this.s = s;
        dfs(0);
        return ans;
    }
    private void dfs(int i){
        if(i == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int j = i;j < s.length();j++){
            if(check(i,j)){
                path.add(s.substring(i,j + 1));
                dfs(j + 1);
                path.remove(path.size() - 1);
            }
        }
    }
    private boolean check(int l,int r){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc131 lc131 = new lc131();
        System.out.println(lc131.partition("aab"));
    }
}
