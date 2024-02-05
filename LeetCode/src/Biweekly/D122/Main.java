package Biweekly.D122;

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = 1000_010;
        int n = scan.nextInt();
        int[] diff = new int[N];
        int leftMin = Integer.MAX_VALUE;
        int rightMax = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            diff[l]++;
            diff[r + 1]--;
            leftMin = Math.min(leftMin,l);
            rightMax = Math.max(rightMax,r);
        }
        int ans = 0;
        int count = 0;
        for(int i = leftMin;i <= rightMax;i++){
            count += diff[i];
            if(count == 0){
                ans += 1;
            } else if( count == 1){
                ans += 3;
            } else{
                ans += 4;
            }
        }
        System.out.println(ans);

    }
}