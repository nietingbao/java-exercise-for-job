public class MinNumInRotate {
    public int minNumberInRotateArray(int [] array) {
        int index1 = 0;
        int index2 = array.length - 1;
        int mid = 0;
        while (index2 >= index1) {
            if (index2 - index1 == 1) {
                mid = index2;
                break;
            }

            if (array[index1] == array[index2]) {
                mid = (index1 + index2)/2;
                if (array[mid] == array[index2]) {
                    return minInOrder(array, index1, index2);
                }
                else if (array[mid] > array[index2]) {
                    index1 = mid;
                }
                else index2 = mid;
            }
            else {
                mid = (index1 + index2)/2;
                if (array[mid] > array[index2]) {
                    index1 = mid;
                }
                else index2 = mid;
            }
        }
        return array[mid];
    }

    /**
     * @return a min in a ordered array
     */
    private int minInOrder(int[] array, int index1, int index2) {
        int min = array[index1];
        for (int i = index1; i <= index2; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }
}
