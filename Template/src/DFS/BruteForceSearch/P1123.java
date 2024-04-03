package DFS.BruteForceSearch;

import java.util.*;

public class P1123 {
    static int n,ans;
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String st = scanner.next();
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            list.add(new String(chars));
        }
        StringBuilder sb = new StringBuilder();
        dfs(0,sb);
        System.out.println(ans);
    }

    private static void dfs(int u, StringBuilder sb) {
        if(u == n){
            Set<Character> set = new HashSet<>();
            for(char c : sb.toString().toCharArray()) set.add(c);
            if(set.size() == n){
                ans++;
            }
            return;
        }
        String s = list.get(u);
        int len = s.length();
        for(int i = 0;i < len;i++){
            sb.append(s.charAt(i));
            dfs(u + 1,sb);
            sb.deleteCharAt(sb.length() - 1);
            while(i + 1 < len && s.charAt(i) == s.charAt(i + 1)) i++;
        }
    }
}
