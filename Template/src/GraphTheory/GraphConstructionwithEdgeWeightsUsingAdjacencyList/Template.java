package GraphTheory.GraphConstructionwithEdgeWeightsUsingAdjacencyList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * n个点，m条边，每行输入三个整数a,b,c 表示a->b连接一条边权为c的边
 * 4 3
 * 1 2 3
 * 2 3 2
 * 3 4 2
 */
public class Template {
    static List<int[]>[] g;
    static int n;
    static int[] f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        f = new int[n + 1];

        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            g[a].add(new int[]{b, c});
            g[b].add(new int[]{a, c});
        }
    }

    static void dfs(int u, int fa) {
        for (int[] pair : g[u]) {
            int x = pair[0];
            int w = pair[1];
            if (x == fa) continue;
            dfs(x, u);
            //代码逻辑
        }
    }
}
