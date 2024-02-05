package BinaryTree;

public class lc129 {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    private int dfs(TreeNode root,int sum){
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        int left = dfs(root.left,sum);
        int right = dfs(root.right,sum);
        return left + right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        lc129 obj = new lc129();
        int res = obj.sumNumbers(root);
        System.out.println(res);
    }
}
