package daily;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oppo1 {
    static HashMap<Character, Integer> map;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        scan.close();
        map = new HashMap<>();
        char[] c = s.toCharArray();
        int l = 0;
        int ans = 0;
        for (int r = 0; r < n; r++) {
            char x = c[r];
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (r - l + 1 == k) {
                if (check()) {
                    ans++;
                }
                map.put(c[l], map.get(c[l]) - 1);
                l++;
            }
        }
        System.out.println(ans);
    }

    private static boolean check() {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
