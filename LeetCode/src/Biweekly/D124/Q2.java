package Biweekly.D124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个字符串 s 。
 * 请你进行以下操作直到 s 为 空 ：
 * 每次操作 依次 遍历 'a' 到 'z'，如果当前字符出现在 s 中，那么删除出现位置 最早 的该字符。
 * 请你返回进行 最后 一次操作 之前 的字符串 s 。
 */
public class Q2 {
//    public String lastNonEmptyString(String s) {
//        //用一个数组记录每个字符的次数
//        int[] count = new int[26];
//        for (char c : s.toCharArray()) {
//            count[c - 'a']++;
//        }
//        //将count排序，找出出现次数最大的字符（可能有多个）
//        int max = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i : count) {
//            max = Math.max(max, i);
//        }
//        for(int i = 0; i < 26; i++){
//            if(count[i] == max){
//                map.put((char)('a' + i), max);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (char c : s.toCharArray()) {
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) - 1);
//                if (map.get(c) == 0) {
//                    sb.append(c);
//                }
//            }
//        }
//        return sb.toString();
//    }
        public String lastNonEmptyString (String S){
            int[] cnt = new int[26];
            int[] last = new int[26];
            char[] s = S.toCharArray();
            for (int i = 0; i < s.length; i++) {
                int b = s[i] - 'a';
                cnt[b]++;
                last[b] = i;
            }

            // 注：也可以再遍历一次 s 直接得到答案，但效率不如下面，毕竟至多 26 个数
            List<Integer> ids = new ArrayList<>();
            int mx = Arrays.stream(cnt).max().getAsInt();
            for (int i = 0; i < 26; i++) {
                if (cnt[i] == mx) {
                    ids.add(last[i]);
                }
            }
            Collections.sort(ids);

            StringBuilder t = new StringBuilder(ids.size());
            for (int i : ids) {
                t.append(s[i]);
            }
            return t.toString();
        }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        String s = "aabcbbca";
        System.out.println(q2.lastNonEmptyString(s));
    }
    }

