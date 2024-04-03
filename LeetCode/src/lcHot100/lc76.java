package lcHot100;

import java.util.HashMap;

/**
 * 给你一个字符串 s 、一个字符串 t 。
 * 返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 */
public class lc76 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        int[] temp = new int[]{Integer.MAX_VALUE, 0};
        int count = 0;
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        int n = s.length();
        for (int i = 0,l = 0; i < n; i++) {
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
            if (mapT.containsKey(c)) {
                if (mapT.get(c).equals(mapS.get(c))) {
                    count++;
                }
            }
            while (count == mapT.size()) {
                char ch = s.charAt(l);
                mapS.put(ch, mapS.getOrDefault(ch, 0) - 1);
                if (mapT.containsKey(ch)) {
                    if (mapS.get(ch) < mapT.get(ch)) {
                        count--;
                        if (i - l + 1 < temp[0]) {
                            temp[0] = i - l + 1;
                            temp[1] = l;
                        }
                    }
                }
                l++;
            }
        }
        if (temp[0] == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(temp[1],temp[1] + temp[0]);
        }
    }

    public static void main(String[] args) {
        lc76 lc76 = new lc76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(lc76.minWindow(s, t));
    }
}
