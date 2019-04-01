import java.util.ArrayList;
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<TreeNode> queen = new ArrayList<>();
        queen.add(root);
        while (!queen.isEmpty()) {
            TreeNode node = queen.remove(0);
            result.add(node.val);
            if (node.left != null)
                queen.add(node.left);
            if (node.right != null)
                queen.add(node.right);
        }
        return result;
    }
}
