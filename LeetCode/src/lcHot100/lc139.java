package lcHot100;

import java.util.HashSet;
import java.util.List;

public class lc139 {
    HashSet<String> set;
    boolean[] flag;
    public boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);
        int n = s.length();
        flag = new boolean[n + 10];
        return dfs(s,0);
    }

    private boolean dfs(String s, int start) {
        if(s.length() == 0) return true;
        if(flag[start]) return false;
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.substring(0,i + 1))){
                if(dfs(s.substring(i + 1),start + i + 1)){
                    return true;
                }
            }
        }
        flag[start] = true;
        return false;
    }
}
