package daily;

import java.util.LinkedList;

public class lc3034 {
    int[] pattern;
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        this.pattern = pattern;
        LinkedList<Integer> list = new LinkedList<>();
        int n = pattern.length;
        int ans = 0;
        for (int num : nums) {
            list.add(num);
            if (list.size() == n + 1) {
                if (check(list)) ans++;
                list.removeFirst();
            }
        }
        return ans;
    }
    private boolean check(LinkedList<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            if(pattern[i - 1] == 0){
                if(!list.get(i).equals(list.get(i - 1))){
                    return false;
                }
            } else if(pattern[i - 1] == -1){
                if(list.get(i) >= list.get(i - 1)){
                    return false;
                }
            } else {
                if(list.get(i) <= list.get(i - 1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc3034 solution = new lc3034();
        int[] nums = {376068870,376068870,376068870,412890845};
        int[] pattern = {0,1};
        System.out.println(solution.countMatchingSubarrays(nums, pattern));
    }
}
