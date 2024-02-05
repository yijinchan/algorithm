package BinaryTree;

public class lc98 {
    public boolean isValidBST(TreeNode root) {
        return dfs(root)[1] != Long.MAX_VALUE;
    }

    private long[] dfs(TreeNode node) {
        if (node == null)
            return new long[]{Long.MAX_VALUE, Long.MIN_VALUE};
        long[] left = dfs(node.left);
        long[] right = dfs(node.right);
        long x = node.val;
        if (x <= left[1] || x >= right[0])
            return new long[]{Long.MIN_VALUE, Long.MAX_VALUE};
        return new long[]{Math.min(left[0], x), Math.max(right[1], x)};
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode rightLeft = new TreeNode(3);
        TreeNode rightRight = new TreeNode(6);
        root.left = left;
        root.right = right;
        right.left = rightLeft;
        right.right = rightRight;
        lc98 obj = new lc98();
        boolean res = obj.isValidBST(root);
        System.out.println(res);
    }
}
