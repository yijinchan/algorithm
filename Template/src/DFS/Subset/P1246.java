package DFS.Subset;

import java.util.Scanner;

public class P1246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] week = new int[7];
        for (int i = 0; i < 7; i++) {
            int c = scanner.nextInt();
            for (int j = 0; j < c; j++) {
                int a = scanner.nextInt();
                week[i] |= 1 << a;
            }
            //记录week为不限行的尾号
            week[i] = 1023 - week[i];
        }
        int ans = -1;
        //枚举情况
        for (int i = 1; i <= 2023; i++) {
            int cnt = 0;
            for (int j = 0; j < 10; j++) {
                if ((i >> j & 1) == 1) {
                    cnt++;
                }
            }
            boolean flag = true;
            for (int k = 0; k < 7; k++) {
                if((week[k] & i) == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(ans == -1) ans = cnt;
                else ans = Math.min(ans,cnt);
            }
        }
        System.out.println(ans);
    }
}
