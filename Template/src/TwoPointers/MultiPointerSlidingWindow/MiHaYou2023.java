package TwoPointers.MultiPointerSlidingWindow;

import java.util.Scanner;

/**
 * 塔子哥是一名研究生，正在研究一种基于字符串操作的算法。他最近接到了一个字符串操作的任务，需要将给定的字符串 s 转化为目标字符串 t 。然而，他发现这个任务并不是一件简单的事情。因为他只能进行两种操作：删除 s 中的一个子序列 "mhy" ，或在 s 中添加一个子序列 "mhy" 。
 * 例如，给定 s 为 "mhbdy" ，塔子哥进行一次操作后可以使 s 变成 "bd" ，或者变成 "mhmbhdyy" 。
 * 塔子哥想知道，经过若干次操作后 s 是否可以变成 t ？
 * 注：子序列在原串中的顺序也是从左到右，但可以不连续。
 * 输入描述
 * 第一行输入一个正整数 q，代表询问的次数。
 * 接下来每两行为一次询问：每行均为一个字符串，分别代表 s 和 t 。
 * 输出描述
 * 输出 q 行，每行输入一行答案。若可以使 s 变成 t ，则输出 "Yes" 。否则输出 "No" 。
 * 样例
 * 输入
 * 3
 * mhbdy
 * bd
 * mhbdy
 * mhmbhdyy
 * mhy
 * abc
 * 输出
 * Yes
 * Yes
 * No
 */
public class MiHaYou2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (T-- > 0) {
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            int n = s.length();
            int m = t.length();
            String s1 = "";
            String s2 = "";
            int l = 0, r = 0;

            while (l < n) {
                if (s.charAt(l) == t.charAt(r)) {
                    l++;
                    r++;
                } else {
                    s1 += s.charAt(l++);
                }
            }

            s2 = t.substring(r);

            if (s2.isEmpty()) {
                if (check(s1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if (check(s1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static boolean check(String s) {
        int n = s.length();
        if (n % 3 != 0) {
            return false;
        }
        for (int i = 0; i < n - 3; i++) {
            if (!s.substring(i, i + 3).equals("mhy")) {
                return false;
            }
        }
        return true;
    }
}
