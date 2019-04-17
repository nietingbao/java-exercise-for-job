public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 0;
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        int max = (leftDepth >= rightDepth)?leftDepth:rightDepth;
        depth = 1 + max;
        return depth;
    }
}
