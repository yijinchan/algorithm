package Weekly.R382;

import java.util.HashMap;

public class Q2 {
    public int maximumLength(int[] nums) {
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put((long)i,map.getOrDefault((long)i,0) + 1);
        }
        Integer c1 = map.remove(1L);
        int ans = c1 != null ? c1 - (c1 % 2 ^ 1) : 0;
        for(long x : map.keySet()){
            int res = 0;
            for(;map.getOrDefault(x,0) > 1;x *= x){
                res += 2;
            }
            ans = Math.max(ans,res + (map.containsKey(x) ? 1 : -1));
        }
        return ans;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        System.out.println(q2.maximumLength(new int[]{5,4,1,2,2}));
    }
}
