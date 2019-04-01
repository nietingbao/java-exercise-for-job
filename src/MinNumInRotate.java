public class MinNumInRotate {
    public int minNumberInRotateArray(int [] array) {
        return search(array, 0, array.length - 1);
    }

    private int search(int[] array, int low, int high) {
        if (high - low == 1)
            return high;
        int mid;
        if (array[low] == array[high]) {
           mid = (low + high)/2;
           if (array[mid] == array[low])
               return minInOrder(array, low, high);
           else if (array[mid] > array[low])
               return search(array, mid, high);
           else return search(array, low, mid);
        }
        else {
            mid = (low + high)/2;
            if (array[mid] > array[low])
                return search(array, mid, high);
            else return search(array, low, mid);
        }
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
