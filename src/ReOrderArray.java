public class ReOrderArray {
    public void reOrderArray(int[] array) {
        //剑指offer上的解法
//        if (array.length == 0 || array == null)
//            return;
//        int frontIndex = 0;
//        int endIndex = array.length - 1;
//        while (endIndex > frontIndex) {
//            while (endIndex > frontIndex && isEven(array[frontIndex])) {
//                frontIndex ++;
//            }
//            while (endIndex > frontIndex && !isEven(array[endIndex])){
//                endIndex--;
//            }
//            if (endIndex > frontIndex) {
//                int temp = array[endIndex];
//                array[endIndex] = array[frontIndex];
//                array[frontIndex] = temp;
//            }
//        }

        //牛客网上题目的要求，不打乱以前的顺序
        //思路，每次找到一个奇数，就移动到偶数之前，这里用插入法的思想；
        // 最后把所有的奇数都移到前面了，偶数的顺序不变
        if (array.length == 0)
            return;
        //第一个偶数的索引
        int evenIndex;
        //偶数后面第一个奇数的索引
        int oddIndex = 0;
        //找到第一个偶数
        for (evenIndex = 0; evenIndex < array.length; evenIndex++) {
            if (isEven(array[evenIndex]))
                break;
        }
        System.out.println(evenIndex);
        if (evenIndex == array.length){
            return;
        }
        oddIndex = evenIndex + 1;
        while (oddIndex <= array.length - 1 ) {
            //找到偶数后面第一个奇数
            //           while (isEven(array[oddIndex]))
//                oddIndex++;
            int j;
            for (j = oddIndex; j < array.length; j++) {
                if (!isEven(array[j]))
                    break;
            }
            oddIndex = j;
            //开始移动
            if (oddIndex >= array.length)
                break;
            int odd = array[oddIndex];
            int i;
            for (i = oddIndex ; i > evenIndex; i--) {
                array[i] = array[i - 1];
            }
            array[i] = odd;
            //evenIndex为第一个偶数
            evenIndex = i + 1;
            oddIndex = oddIndex + 1;
        }
    }

    /**
     * @param num 一个整数
     * @return 如果是偶数则返回true
     */
    private boolean isEven(int num) {
        return ((num & 0x1) == 0);

    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,2,4,6};
        ReOrderArray reOrderArray = new ReOrderArray();
        reOrderArray.reOrderArray(a);
    }
}
