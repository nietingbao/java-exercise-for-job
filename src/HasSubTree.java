public class HasSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            boolean result = false;
            if (root1 != null && root2 != null) {
                if (root1.val == root2.val) {
                    result = DoesAHasB(root1, root2);
                }
                if (!result) {
                    result = HasSubtree(root1.left, root2);
                }
                if (!result) {
                    result = HasSubtree(root1.right, root2);
                }
            }

            return result;
    }

    private boolean DoesAHasB(TreeNode root1, TreeNode root2) {
       //注意这一行不能与下面一行交换，因为可能存在都为null的情况，这种情况是应该先返回true的
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;

        return DoesAHasB(root1.left, root2.left)&&DoesAHasB(root1.right,root2.right);
    }
}
