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
    private static int search2(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (high >= low) {
            mid = (low + high)/2;
            if (array[mid] == target)
                return target;
            else if (array[mid] > target)
                high = mid - 1;
            else low = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 10 };
        System.out.println(binarySearch(a, 3));
        System.out.println(search2(a,4));
    }
}
