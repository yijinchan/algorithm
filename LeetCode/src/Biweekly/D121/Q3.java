package Biweekly.D121;

/**
 * 给你两个正整数 x 和 y 。
 * 一次操作中，你可以执行以下四种操作之一：
 * 如果 x 是 11 的倍数，将 x 除以 11 。
 * 如果 x 是 5 的倍数，将 x 除以 5 。
 * 将 x 减 1 。
 * 将 x 加 1 。
 * 请你返回让 x 和 y 相等的 最少 操作次数。
 */
public class Q3 {
    public int minimumOperationsToMakeEqual(int x, int y) {
        if (x < y) {
            return y - x;
        }
        int ans = x - y;
        ans = Math.min(ans, minimumOperationsToMakeEqual(x / 11, y) + x % 11 + 1);
        ans = Math.min(ans, minimumOperationsToMakeEqual(x / 11 + 1, y) - 11 + x % 11 + 1);
        ans = Math.min(ans, minimumOperationsToMakeEqual(x / 5, y) + x % 5 + 1);
        ans = Math.min(ans, minimumOperationsToMakeEqual(x / 5 + 1, y) - 5 + x % 5 + 1);
        return ans;
    }
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        System.out.println(q3.minimumOperationsToMakeEqual(1000000000, 400000000));
    }
}
