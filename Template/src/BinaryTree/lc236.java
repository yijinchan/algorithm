package BinaryTree;

public class lc236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        //[3,5,1,6,2,0,8,null,null,7,4]
        //5
        //4
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(5);
        TreeNode x = new TreeNode(1);
        root.left = p;
        root.right = x;
        p.left = new TreeNode(6);
        p.right = new TreeNode(2);
        p.right.left = new TreeNode(7);
        p.right.right = new TreeNode(4);
        TreeNode q = new TreeNode(4);
        x.left = new TreeNode(0);
        x.right = new TreeNode(8);
        lc236 lc236 = new lc236();
        System.out.println(lc236.lowestCommonAncestor(root,p,q).val);
    }
}
