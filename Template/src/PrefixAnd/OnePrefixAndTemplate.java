package PrefixAnd;

import java.util.Scanner;

/**
 * 一维前缀和
 * 题目描述
 * 输入一个长度为n的整数序列。
 * 接下来再输入m个询问，每个询问输入一对l,r
 * 对于每个询问，输出原序列中从第l个数到第r个数的和。
 * 输入格式
 * 第一行包含两个整数n和m。
 * 第二行包含n个整数，表示整数数列。
 * 接下来m 行，每行包含两个整数l 和r，表示一个询问的区间范围。
 *
 * 输出格式
 * 共m行，每行输出一个询问的结果。
 * 数据范围
 */
public class OnePrefixAndTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000005;
        int[] a = new int[N];
        int[] S = new int[N];

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            S[i] = S[i - 1] + a[i];
        }

        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(S[r] - S[l - 1]);
        }

        sc.close();
    }
}
