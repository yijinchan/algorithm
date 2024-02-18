package Weekly.R385;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public long countPrefixSuffixPairs(String[] words) {
        long ans = 0;
        Node root = new Node();
        for (String S : words) {
            char[] s = S.toCharArray();
            int n = s.length;
            Node cur = root;
            for (int i = 0; i < n; i++) {
                int p = (s[i] - 'a') << 5 | (s[n - 1 - i] - 'a');
                cur = cur.son.computeIfAbsent(p, k -> new Node());
                ans += cur.cnt;
            }
            cur.cnt++;
        }
        return ans;
    }
}

class Node {
    Map<Integer, Node> son = new HashMap<>();
    int cnt;
}

