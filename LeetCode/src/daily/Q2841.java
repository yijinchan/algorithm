package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q2841 {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum = 0,temp = 0;
        int n = nums.size();
        int x = 0,l = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r = 0;r < n;r++){
            x = nums.get(r);
            map.put(x,map.getOrDefault(x,0) + 1);
            temp += x;
            while(r - l == k - 1){
                if(check(map,m,k)){
                    sum = Math.max(sum,temp);
                }
                l++;
            }
        }
        return sum;
    }
    private boolean check(HashMap<Integer,Integer> map,int m,int k){
        boolean flag = true;
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value > k - m + 1) flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Q2841 q2841 = new Q2841();
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        nums.add(1);
        nums.add(7);
        System.out.println(q2841.maxSum(nums,3,4));
    }
}
