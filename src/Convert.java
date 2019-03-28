public class Convert {
    private TreeNode pre = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        Convert(pRootOfTree.left);
        pre.right = pRootOfTree;
        pRootOfTree.left = pre;
        pre = pRootOfTree;
        head = head == null ? pRootOfTree : head;
        Convert(pRootOfTree.right);
        return head;
    }

}


