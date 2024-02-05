package OneDimensionalDifference;

import java.util.Scanner;

/**
 * 输入一个长度为n的整数序列。
 * 接下来输入m个操作，每个操作包含三个整数 1,r,，表示将序列中[l,r]之间的每个数加上c。
 * 请你输出进行完所有操作后的序列。
 * 输入格式
 * 第一行包含两个整数n和m。
 * 第二行包含 n 个整数，表示整数序列。
 * 接下来m 行，每行包含三个整数 1，r，c，表示一个操作.
 * 输出格式
 * 共一行，包含 n 个整数，表示最终序列。
 * 输入样例
 * 6 3
 * 1 2 2 1 2 1
 * 1 3 1
 * 3 5 1
 * 1 6 1
 * 输出样例
 * 3 4 5 3 4 2
 */
public class template {
    int[] b = new int[100010];
    public  void insert(int l ,int r ,int c){
        b[l] += c;
        b[r+1] -= c;
    }
    public static void main(String[] args){
        new template().test();
    }
    public void test(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n+1];

        for(int i = 1 ; i <= n ; i ++ ){
            a[i] = scan.nextInt();
        }
        for(int i = 1;i <= n ; i ++ ){
            insert(i,i,a[i]);
        }
        while(m-->0){
            int l = scan.nextInt();
            int r = scan.nextInt();
            int c = scan.nextInt();
            insert(l,r,c);
        }
        for(int i = 1;i <= n ; i ++ ){
            a[i] = a[i-1] + b[i];
            System.out.print(a[i] + " ");
        }

    }
}
