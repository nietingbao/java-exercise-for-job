import java.util.*;
public class ConstrctTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0||in.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                //Arrays.copyOfRange方法copy出来的数组的长度等于to-from,因此，to不是末尾的索引位置。
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1 , i + 1 ), Arrays.copyOfRange(in, 0, i  ));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1, pre.length),Arrays.copyOfRange(in, i+1,in.length ));
            }
        }
        return root;
    }

}
