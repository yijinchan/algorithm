package DFS.subset;

import java.util.Scanner;

/**
 * 子集型枚举，采用二进制枚举
 */
public class P1509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();

        int ans = 0;
        int mask = 1 << n;
        for (int i = 0; i < mask; ++i) {
            long sum = 0;
            int cnt = 0;
            for (int j = 0; j < n; ++j) {
                if ((i >> j & 1) == 1) {
                    sum += a[j];
                    cnt++;
                }
            }
            if (sum >= 0) {
                ans += cnt;
            }
        }

        System.out.println(ans);
    }
}
