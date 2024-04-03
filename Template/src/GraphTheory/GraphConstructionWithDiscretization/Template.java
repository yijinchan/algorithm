package GraphTheory.GraphConstructionWithDiscretization;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * n个点，m条边，每行输入两个整数a，b，表示a->b连接一条有向边
 * 最后一行输入n个整数，表示n个点的点权
 * 4 3
 * 1 2
 * 2 3
 * 3 4
 * 1 2 3 4
 */
public class Template {
    static final int N = 100010;
    static ArrayList<Integer>[] g = new ArrayList[N];
    static int[] w = new int[N];

    static void dfs(int u, int fa) {
        // Do things
        for (int x : g[u]) {
            if (x == fa)
                continue;
            dfs(x, u);
            // Do things
        }
    }

    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            g[a].add(b);  // a->b建立一条边
        }

        for (int i = 1; i <= n; i++) {
            w[i] = scanner.nextInt();
        }
    }
}
