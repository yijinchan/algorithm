package SingleSetOfInputs;

import java.util.Scanner;

/**
 * 第一行给定一个整数n，表示数组大小，第二行给定n个整数，每个整数用空格隔开，
 * 表示数组中的n个数字，请你返回数组中的元素之和。
 * 5
 * 1 2 3 4 5
 */
public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 100010; // 假设数组大小最多为100010
        int[] w = new int[N];

        int n = scanner.nextInt(); // 读取数组大小
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt(); // 读取n个整数
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += w[i];
        }

        System.out.println(sum); // 输出元素和
    }
}
