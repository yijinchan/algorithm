package SingleSetOfInputs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 给定一行数字，每个数字用空格隔开，请你将这些数字排序后并输出排序后的结果
 * 输入样例
 * 8 5 4 2 7
 * 输出样例
 * 2 4 5 7 8
 */
public class no3 {
    public static void main(String[] args) {
        // 创建 ArrayList 对象，用于存储整数数据
        ArrayList<Integer> w = new ArrayList<>();

        // 创建 Scanner 对象，用于从标准输入读取数据
        Scanner scanner = new Scanner(System.in);

        // 循环读取一行的数据，直到输入结束
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            // 将读取的整数添加到 ArrayList 中
            w.add(x);
        }

        // 使用 Collections 类中的 sort 方法对 ArrayList 进行排序
        Collections.sort(w);

        // 遍历排序后的 ArrayList，输出结果
        for (int x : w) {
            System.out.print(x + " ");
        }

        // 关闭 Scanner 对象
        scanner.close();
    }
}
