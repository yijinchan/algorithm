package MeiTuan.SummerInternship2024_3_16;

import java.util.Scanner;

/**
 * 塔子哥定义以下三种单词是合法的: 1.所有字母都是小写。例如:good
 * 2.所有字母都是大写。例如:APP 3.第一个字母大写，后面所有字母都是小写。例如:Alice
 * 现在塔子哥拿到了一个单词，她每次操作可以修改任意一个字符的大小写。塔子哥想知道最少操作几次可以使得单词变成合法的?
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int ans = Integer.MAX_VALUE;
        int low = 0, up = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                low++;
            } else {
                up++;
            }
        }
        if (Character.isUpperCase(str.charAt(0))) {
            ans =  up - 1;
        } else {
            ans = Math.min(ans,1 + up);
        }
        ans = Math.min(ans,Math.min(up,low));
        System.out.println(ans);
    }
}
