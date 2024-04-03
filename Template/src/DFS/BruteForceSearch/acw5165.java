package DFS.BruteForceSearch;

import java.util.Scanner;

public class acw5165 {
    static char[][] g;
    static String s;
    static int n, m, k, res;
    static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, -1, 1, 1, -1};

    public static void dfs(int x, int y, int u, int dirc, int flag) {
        if (x < 0 || x >= n || y < 0 || y >= m || g[x][y] != s.charAt(u)) {
            return;
        }
        if (u == k - 1) {
            res++;
            return;
        }
        int a = x + dx[dirc];
        int b = y + dy[dirc];
        dfs(a, b, u + 1, dirc, flag);
        if (flag == 0 && u > 0) {
            int t = 0;
            if (dirc >= 4) {
                t = 4;
                dirc -= 4;
            }
            int d1 = t + (dirc + 3) % 4;
            int d2 = t + (dirc + 1) % 4;
            int a1 = x + dx[d1];
            int b1 = y + dy[d1];
            int a2 = x + dx[d2];
            int b2 = y + dy[d2];
            dfs(a1, b1, u + 1, d1, flag + 1);
            dfs(a2, b2, u + 1, d2, flag + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        k = s.length();
        n = scanner.nextInt();
        m = scanner.nextInt();
        g = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = scanner.next().charAt(0);
            }
        }

        res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int d = 0; d < 8; d++) {
                    dfs(i, j, 0, d, 0);
                }
            }
        }
        System.out.println(res);
    }
}
