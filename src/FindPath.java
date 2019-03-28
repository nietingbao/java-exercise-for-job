import java.util.ArrayList;
public class FindPath {
    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null)
            return lists;
        target -= root.val;
        list.add(root.val);
        if (target == 0&&root.left==null &&root.right == null) {
            lists.add(new ArrayList<>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return lists;
    }
}
