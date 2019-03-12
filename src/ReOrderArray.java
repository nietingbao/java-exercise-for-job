public class ReOrderArray {
    public void reOrderArray(int[] array) {
        if (array.length == 0 || array == null)
            return;
        int frontIndex = 0;
        int endIndex = array.length - 1;
        while (endIndex > frontIndex) {
            while (endIndex > frontIndex && isEven(array[frontIndex])) {
                frontIndex ++;
            }
            while (endIndex > frontIndex && !isEven(array[endIndex])){
                endIndex--;
            }
            if (endIndex > frontIndex) {
                int temp = array[endIndex];
                array[endIndex] = array[frontIndex];
                array[frontIndex] = temp;
            }
        }
    }

    /**
     * @param num 一个整数
     * @return 如果是奇数则返回true
     */
    private boolean isEven(int num) {
        return ((num & 0x1) != 0);

    }
}
