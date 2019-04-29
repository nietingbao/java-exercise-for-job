public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        //做错了


        if (isLeaf(pNode)){
            if (isRoot(pNode))//是根
                return null;
            else if (pNode.next.left == pNode)//是左叶子，返回父节点
                return pNode.next;
            else if (pNode.next.right == pNode){
                //是右叶子，找到第一个左父亲
                TreeLinkNode father = pNode.next;
                while (father!=null&&father==father.right.next)
                    father = father.next;
                return father;//可能这样的father不存在，那么自然会返回null
            }
        }
        else {
            //找右边的最左
            if (pNode.right!=null)
                pNode = pNode.right;
            else return null;
            //一直往左找
            while (pNode.left!=null)
                pNode = pNode.left;
            return pNode;
        }
        return null;
    }
    private boolean isLeaf(TreeLinkNode p){
        return p.left==null&&p.right==null;
    }

    private boolean isRoot(TreeLinkNode p) {
        return p.next==null;
    }

}
