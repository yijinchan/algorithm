package DFS.BruteForceSearch;

import java.util.Scanner;

public class P1056 {
    private static final int N = 110;
    private static char[][] g = new char[N][N];
    private static boolean[][] st = new boolean[N][N];
    private static int k1, k2, n, m;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k1 = scan.nextInt();
        k2 = scan.nextInt();
        n = scan.nextInt();
        m = scan.nextInt();
        for (int i = 0; i < n; i++) {
            g[i] = scan.next().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 'S') {
                    st[i][j] = true;
                    if (dfs(i, j, -1, -1, 0)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    private static boolean dfs(int x, int y, int dirc, int w1, int w2) {
        if (g[x][y] == 'T' && w1 <= k1 && w2 <= k2){
            return true;
        }
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a < 0 || a >= n || b < 0 || b >= m || st[a][b]
                    || w1 + (dirc != i ? 1 : 0) > k1 || w2 + (g[a][b] == '*' ? 1 : 0) > k2) {
                continue;
            }
            st[a][b] = true;
            if (dfs(a,b,i,w1 + (dirc != i ? 1 : 0), w2 + (g[a][b] == '*' ? 1 : 0))) {
                return true;
            }
            st[a][b] = false;
        }
        return false;
    }
}
