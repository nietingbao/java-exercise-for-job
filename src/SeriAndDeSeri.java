public class SeriAndDeSeri {
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root==null){
            sb.append("#,");
            return sb.toString();
        }

        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return String.valueOf(sb);
    }
    TreeNode Deserialize(String str) {
        index++;
        String[] strings = str.split(",");
        TreeNode newNode = null;
        if (!strings[index].equals("#") ) {
            newNode = new TreeNode(Integer.valueOf(strings[index]));
            newNode.left = Deserialize(str);
            newNode.right = Deserialize(str);

        }
        return newNode;

    }
}
