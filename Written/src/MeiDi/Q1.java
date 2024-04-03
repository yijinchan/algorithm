package MeiDi;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int ans = 0;
        int n = s.length();
        int cntP = 0, cntM = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'P') {
                cntP++;
                if (cntP > 3) {
                    ans += 15;
                } else {
                    ans += 10;
                }
            } else if (c == 'G') {
                cntP = 0;
                ans += 5;
            } else if (c == 'M') {
                cntM++;
                cntP = 0;
                if (cntM >= 3) {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
