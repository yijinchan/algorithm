package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return Collections.emptyList();
        List<List<Integer>> ans = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        boolean flag = false;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> path = new ArrayList<>(n);
            while(n-- > 0){
                TreeNode temp = q.pop();
                path.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            if(flag){
                Collections.reverse(path);
            }
            flag = !flag;
            ans.add(path);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
