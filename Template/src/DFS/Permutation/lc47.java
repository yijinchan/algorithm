package DFS.Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc47 {
    private int[] nums;
    private boolean[] onPath;
    private List<Integer> path;
    private final List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums = nums;
        Arrays.sort(nums);
        int n = nums.length;
        path = Arrays.asList(new Integer[n]);
        onPath = new boolean[n];
        dfs(0);
        return ans;
    }
    private void dfs(int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int j = 0;j < nums.length;j++){
            if(j > 0 && !onPath[j-1] && nums[j] == nums[j-1]) continue;
            if(!onPath[j]){
                path.set(i,nums[j]);
                onPath[j] = true;
                dfs(i + 1);
                onPath[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        lc47 obj = new lc47();
        List<List<Integer>> res = obj.permuteUnique(new int[]{1,1,2});
        for (List<Integer> re : res) {
            System.out.println(re);
        }
    }
}
