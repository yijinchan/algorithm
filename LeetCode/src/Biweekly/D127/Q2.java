package Biweekly.D127;

public class Q2 {
    public int minimumLevels(int[] possible) {
        int n = possible.length;
        for (int i = 0; i < n; i++) {
            if(possible[i] == 0) {
                possible[i] = -1;
            }
        }
        //后缀和
        int[] preSum = new int[n + 1];
        int[] sufSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + possible[i];
        }
        for (int i = n; i > 0; i--) {
            sufSum[i - 1] = sufSum[i] + possible[i - 1];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if(preSum[i] > sufSum[i]) {
               ans = i;
               break;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[] possible = {0,0};
        System.out.println(q2.minimumLevels(possible));
    }
}
