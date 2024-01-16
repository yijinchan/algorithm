package MultipleSetsOfInputs;

import java.util.Scanner;

/**
 * 第一行给定一个整数T，表示输入样例的组数，接下来T*2行，第一行给定一个整数n，
 * 表示数组大小，第二行给定n个整数，每个整数用空格隔开，表示数组中的n个数字，
 * 请你返回每一组的数组中的元素之和。
 * 输入样例
 * 3
 * 4
 * 3 2 1 4
 * 5
 * 1 4 5 6 7
 * 3
 * 2 3 1
 * 输出样例
 * 10
 * 23
 * 6
 */
public class no1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建一个Scanner对象来接收用户输入
        int T = scanner.nextInt(); // 从控制台读取一个整数T，表示多组测试数据
        for (int i = 0; i < T; i++) { // 循环T次，调用solve方法处理每组测试数据
            solve(scanner);
        }
    }

    static void solve(Scanner scanner) {
        int n = scanner.nextInt(); // 从控制台读取一个整数n
        int sum = 0; // 初始化一个变量sum来存储列表元素的总和
        for (int i = 0; i < n; i++) { // 循环n次，读取n个整数并计算它们的总和
            int x = scanner.nextInt(); // 从控制台读取一个整数x
            sum += x; // 将x添加到总和中
        }
        System.out.println(sum); // 打印最终的总和结果
    }

}
