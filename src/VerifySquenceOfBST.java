public class VerifySquenceOfBST {
    //判断一个整型数组是不是一个二叉搜索树的后序遍历结果
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0)
            return false;
        //先找出根的前面第一个比根小的数字的索引，那么这个索引以及以前的数字都应该比根小；
        //而这个索引到根之间的数字都应该比根大;了能找不到这个index，记为-1
        return isBackOrder(sequence,0 , sequence.length - 1 );
    }

    private int findLowIndex(int[] sequence, int start, int root) {
        for (int i = root; i >= start ; i--) {
            if (sequence[i] < sequence[root]) {
                return i;
            }

        }
        return -1;
    }

    private boolean isBackOrder(int[] sequence, int start, int rootIndex) {

        if (start >= rootIndex)
            return true;
        int index = findLowIndex(sequence,start,rootIndex);
        for (int i = 0; i <= index; i++) {
            if (sequence[i] > sequence[rootIndex])
                return false;
        }
        for (int i = index + 1; i < rootIndex; i++) {
            if (sequence[i] < sequence[rootIndex])
                return false;
        }
        if (index == -1)
            return isBackOrder(sequence, index + 1, rootIndex-1);
        return isBackOrder(sequence, start, index)&&isBackOrder(sequence, index + 1, rootIndex-1);
    }
}
