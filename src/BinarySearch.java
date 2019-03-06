public class BinarySearch {
    static boolean binarySearch(int[] array, int x) {
        return search(array, 0, array.length - 1, x);
    }
    private static boolean search(int[] array, int low, int high, int x) {
        while (low <= high) {
            int mid = (low + high)/2;
            if(array[mid] == x) {
                return true;
            }
            else if (array[mid] < x) {
                low = mid + 1;
                return search(array, low, high, x);
            }
            else return search(array, low, mid - 1, x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 10 };
        System.out.println(binarySearch(a, 3));
    }
}
