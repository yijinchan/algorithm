package SingleSetOfInputs;

import java.util.Scanner;

/**
 * 给定一个n*m的矩形，矩形中的元素不是1就是0，每个1可以和上下左右四个方向的1构成一整个连通块，求这个矩形中含有的连通块数量
 * 其实就是LeetCode原题，改成了ACM模式：LeetCode 200. 岛屿数量
 * 输入描述
 * 第一行输入两个整数n,m用空格隔开
 * 接下来n行，每行输入m个整数，用,
 * 3 3
 * 1,1,1
 * 0,0,1
 * 1,0,1
 */
public class no2 {
    public static void main(String[] args) {
        // 创建 Scanner 对象，用于从标准输入读取数据，设置分隔符为逗号或空白字符
        Scanner scanner = new Scanner(System.in).useDelimiter(",|\\s+");

        // 定义矩阵的最大大小
        int N = 1010;
        // 创建二维数组，用于存储矩阵数据，数组大小为 N 行 N 列
        int[][] g = new int[N][N];

        // 声明变量 n 和 m，用于表示矩阵的行数和列数
        int n, m;

        // 从输入中读取一个整数，表示矩阵的行数，并将其赋值给变量 n
        n = scanner.nextInt();
        // 从输入中读取一个整数，表示矩阵的列数，并将其赋值给变量 m
        m = scanner.nextInt();

        // 外层循环迭代矩阵的每一行，i 表示当前行的索引
        for (int i = 0; i < n; i++) {
            // 内层循环迭代矩阵的每一列，j 表示当前列的索引
            for (int j = 0; j < m; j++) {
                // 从输入中读取一个整数，表示矩阵中当前位置的值，并将其赋值给二维数组 g 的对应位置
                g[i][j] = scanner.nextInt();
                // 打印矩阵中当前位置的值，以及一个空格
                System.out.print(g[i][j] + " ");
            }
            // 在内层循环结束后换行，以打印下一行的值
            System.out.println();
        }

        // 关闭 Scanner 对象
        scanner.close();
    }
}
