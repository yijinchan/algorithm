package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n - 2;i++){
            int x = nums[i];
            if(i > 0 && x == nums[i + 1]) continue;
            if(x + nums[i + 1] + nums[i + 2] > 0) break;
            if(x + nums[n - 1] + nums[n - 2] < 0) continue;
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int s = x + nums[j] + nums[k];
                if(s > 0){
                    k--;
                } else if(s < 0){
                    j++;
                } else {
                    ans.add(Arrays.asList(x,nums[j],nums[k]));
                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        lc15 lc15 = new lc15();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        for(List<Integer> list : lc15.threeSum(nums)){
            for(int x : list){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
