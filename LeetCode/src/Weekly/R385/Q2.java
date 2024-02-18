package Weekly.R385;

import java.util.HashSet;

public class Q2 {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        for (int i : arr1) {
            String s = Integer.toString(i);
            for (int j = 1; j <= s.length(); j++) {
                set.add(s.substring(0, j));
            }
        }
        for (int i : arr2) {
            String s = Integer.toString(i);
            for (int j = 1; j <= s.length(); j++) {
                if (!set.contains(s.substring(0, j))) {
                    break;
                }
                ans = Math.max(ans,j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[] arr1 = {1,10,100};
        int[] arr2 = {1000};
        System.out.println(q2.longestCommonPrefix(arr1, arr2));
    }
}
