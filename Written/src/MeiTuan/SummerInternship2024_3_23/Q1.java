package MeiTuan.SummerInternship2024_3_23;

import java.util.Scanner;

/**
 * 塔子哥拿到了一个n行m列的矩阵，他想知道该矩阵有多少个2∗2的子矩形满足1和0数量相等。
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n + 1][m + 1];
        int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String str = scanner.next();
            for (int j = 1; j <= m; j++) {
                a[i][j] = str.charAt(j - 1) - '0';
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i][j];
            }
        }
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                int x1 = i - 1;
                int y1 = j - 1;
                int x2 = i;
                int y2 = j;
                int x = s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1];
                if (x == 2) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
