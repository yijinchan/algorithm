package BinaryTree;

public class lc230 {
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }
    private void dfs(TreeNode root,int k){
        if(root == null) return;
        dfs(root.left,k);
        if(--k == 0) ans = root.val;
        dfs(root.right,k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode leftRight = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.right = leftRight;
        lc230 obj = new lc230();
        int res = obj.kthSmallest(root,1);
        System.out.println(res);
    }
}
