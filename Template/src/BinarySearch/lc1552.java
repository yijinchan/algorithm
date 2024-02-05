package BinarySearch;

import java.util.Arrays;

public class lc1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l = position[0],r = position[n - 1];
        while(l < r){
            int mid = (l + r + 1) / 2;
            if(check(position,n,mid,m)){
                l = mid;
            } else{
                r = mid - 1;
            }
        }
        return l;
    }
    private boolean check(int[] position,int n,int mid,int m){
        int cnt = 1;
        int pre = position[0];
        for(int i = 1;i < n;i++){
            if(mid <= position[i] - pre){
                cnt++;
                pre = position[i];
            }
        }
        return cnt >= m;
    }

    public static void main(String[] args) {
        int[] position = {79,74,57,22};
        int m = 4;
        lc1552 lc1552 = new lc1552();
        System.out.println(lc1552.maxDistance(position,m));
    }
}
