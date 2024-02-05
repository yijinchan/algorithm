package BinarySearch;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class tencent20230323Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        int n = s.length();
        int l = 1,r = 1000000000;
        while(l < r){
            int mid = (l + r) / 2;
            if(check(s,k,mid,n)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        System.out.println(l);
    }

    private static boolean check(String s, int k, int mid, int n) {
        int cnt = 0,len = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
            len++;
            if(set.size() * len > mid){
                cnt++;
                set.clear();
                i--;
                len = 0;
            }
        }
        if(!set.isEmpty()){
            cnt++;
        }
        return cnt <= k;
    }
}
