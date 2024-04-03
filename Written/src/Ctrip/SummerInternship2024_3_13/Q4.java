package Ctrip.SummerInternship2024_3_13;

import java.util.Scanner;

/**
 * 游游拿到了一个字符串，她想重排这个字符串后，使得该字符串包含尽可能多的"you"连续子串。你能帮帮她吗？
 * 输入描述
 * 一个仅包含小写字母的字符串，长度不超过10^5
 * 输出描述
 * 重排后的字符串。有多解时输出任意即可。
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.next();
        int n = str.length();
        int[] arr = new int[26];
        for(char c : str.toCharArray()){
            arr[c - 'a']++;
        }

    }
}
