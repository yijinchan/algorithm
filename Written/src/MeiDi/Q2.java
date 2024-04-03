package MeiDi;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String s = S.substring(1, S.length() - 1);
        String[] arr = s.split(",");
        int n = arr.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        int[] distinctNums = Arrays.stream(nums).distinct().sorted().toArray();
        int len = distinctNums.length;
        for (int i = 0; i < len ;i++) {
            if(i == len - 1) {
                System.out.print(distinctNums[i]);
            } else {
                System.out.print(distinctNums[i] + ",");
            }
        }
    }
}
