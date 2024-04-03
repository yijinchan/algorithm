package DFS.BruteForceSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1074 {

    static int N, M, P;
    static List<Integer> path = new ArrayList<>();
    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        P = scan.nextInt();
        dfs(0, 0, 0);

        for (int i = 0; i < M; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(ans.get(0).get(i));
        }
        System.out.println(-1);
    }

    private static void dfs(int sumN, int sumM, int sumP) {
        if (sumN > N || sumP > P) return;
        if (M == sumM) {
            if (sumN == N && sumP == P) {
                ans.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = 1; i <= N; i++) {
            path.add(i);
            dfs(sumN + i, sumM + 1, sumP + i * i);
            path.remove(path.size() - 1);
        }
    }
}
