import java.util.ArrayList;
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        ArrayList<Integer> print = new ArrayList<>();
        print.add(root.val);
        printReversely(print, root);
        return print;
    }

    private void printReversely(ArrayList<Integer> print, TreeNode root) {
        if (root.left != null|| root.right != null){
            if (root.left!=null)
                print.add(root.left.val);
            if (root.right != null)
                print.add(root.right.val);
        }
        if (root.left!=null)
            printReversely(print, root.left);
        if (root.right != null)
            printReversely(print,root.right);
    }
}
