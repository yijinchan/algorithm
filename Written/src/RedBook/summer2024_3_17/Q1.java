package RedBook.summer2024_3_17;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //给你一个数n，同时选中最左边和最右边的数的概率是多少，保留十位小数
        int n = scan.nextInt();
        double res = 0;
        if (n == 2) {
            res = 1;
        } else {
            res =( 2.0 / n) * (1.0/(n-1));
        }
        System.out.printf("%.10f", res);
    }
}
