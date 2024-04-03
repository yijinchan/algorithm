package GraphTheory.Dijkstra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 给定一个 n个点 m 条边的有向图，图中可能存在重边和自环，所有边权均为非负值。
 * 请你求出 1号点到 n 号点的最短距离，如果无法从 1 号点走到 n号点，则输出 −1−1。
 * 输入格式
 * 第一行包含整数 n 和 m。
 * 接下来 m 行每行包含三个整数 x,y,z，表示存在一条从点 x 到点 y 的有向边，边长为 z。
 * 输出格式
 * 输出一个整数，表示 11 号点到 n 号点的最短距离。
 * 如果路径不存在，则输出 −1−1。
 * 数据范围
 * 1≤n,m≤1.5×10^5
 * 图中涉及边长均不小于0，且不超过10000。
 * 数据保证：如果最短路存在，则最短路的长度不超过10^9。
 * 输入样例
 * 3 3
 * 1 2 2
 * 2 3 1
 * 1 3 4
 * 输出样例
 * 3
 */
public class Template {

    static int N = 100010;

    static int n, m, idx;
    static int [] h = new int [N] ;
    static int [] w = new int [N] ;
    static int [] e = new int [N] ;
    static int [] ne = new int [N] ;
    static int [] dist = new int [N] ;
    static boolean [] st = new boolean [N];

    private static void add(int a, int b, int c)
    {
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx ++ ;
    }

    public static void main (String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out)) ;
        String [] values = br.readLine().split("\\s+");
        n = Integer.parseInt(values[0]);
        m = Integer.parseInt(values[1]);
        Arrays.fill(h, -1) ;
        while (m-- > 0) {
            values = br.readLine().split("\\s+");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int c = Integer.parseInt(values[2]);
            add(a, b, c);
        }

        int ret = dijkstra(n);
        log.write(ret + "\n") ;
        log.flush();
        log.close();
        br.close();

    }

    private static int dijkstra (int n){
        PriorityQueue<int[]> pq = new PriorityQueue<>(n, (a, b) -> {return a[1] - b[1];}) ;
        int INF = 1 << 30 ;
        Arrays.fill(dist,INF);
        pq.offer(new int []{1, 0}) ;
        dist[1] = 0 ;
        while (!pq.isEmpty()) {
            int [] cur = pq.poll();
            int ver = cur[0] ;
            int distance = cur[1] ;
            if (st[ver]) continue ;
            st[ver] = true;
            for (int i = h[ver]; i != -1; i = ne[i]){
                int j = e[i];
                if (dist[j] > distance + w[i]){
                    dist[j] = distance + w[i];
                    pq.offer(new int [] {j, dist[j]});
                }
            }
        }
        return dist[n] == INF ? -1 : dist[n];
    }
}
