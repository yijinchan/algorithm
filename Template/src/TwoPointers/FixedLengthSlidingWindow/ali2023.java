package TwoPointers.FixedLengthSlidingWindow;

import java.util.Scanner;

/**
 * 题目内容
 * 塔子哥是一个大学生，他喜欢研究各种关于字符串的问题。有一天，他在研究字符串问题时想到了这个问题。
 * 这道题目给定一个长度为n ( n\le 10^5 )的、由数字字符组成的字符串，你可以进行如下操作： 选择一个字符，使得其加 1 或者减 1 。
 * 请注意,你无法对0进行减 1 操作，也无法对9进行加 1 操作。
 * 若干次操作后，你需要使得该字符串存在一个长度为 k ( 1\le k\le n )的、所有字符都相同的连续子串。请你计算出操作的最小次数。
 * 输入
 * 3 2
 * 1 2 3
 * 输出
 * 1
 */
public class ali2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }

        int res = Integer.MAX_VALUE;

        for (int x = 1; x <= 9; x++) {
            int cost = 0;

            for (int l = 0, r = 0; r < n; r++) {
                cost += Math.abs(w[r] - x);

                while (r - l + 1 > k) {
                    cost -= Math.abs(w[l] - x);
                    l++;
                }

                if (r - l + 1 == k) {
                    res = Math.min(res, cost);
                }
            }
        }

        System.out.println(res);
    }
}
