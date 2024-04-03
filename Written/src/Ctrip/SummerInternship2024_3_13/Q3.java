package Ctrip.SummerInternship2024_3_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() <= 2) {
            System.out.println(s);
            return;
        }
        s = s.substring(1, s.length() - 1);
        String[] strArr = s.split(",");
        int[] val = new int[strArr.length];
        int[] count = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            int index = strArr[i].indexOf('(');
            val[i] = Integer.parseInt(strArr[i].substring(0, index));
            count[i] = Integer.parseInt(strArr[i].substring(index + 1, strArr[i].length() - 1));
        }

        String ans = solve(val, count);
        System.out.println(ans);
        scanner.close();
    }

    public static String solve(int[] val, int[] count) {
        List<String> ans = new ArrayList<>();
        int n = val.length;
        long num = val[0];
        long cnt = count[0];

        for (int i = 1; i < n; i++) {
            if (val[i] != num) {
                ans.add(String.format("%d(%d)", num, cnt));
                num = val[i];
                cnt = count[i];
            } else {
                cnt += count[i];
            }

            if (i == n - 1) {
                ans.add(String.format("%d(%d)", num, cnt));
            }
        }

        return "[" + String.join(",", ans) + "]";
    }
}
