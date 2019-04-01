import java.util.Random;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 0)
            return -1;
        int start = 0;
        int end = array.length - 1;
        int mid = array.length/2;
        int par = partition(array, start, end);
        while (mid!=par){
            if (par > mid) {
                end = par - 1;
            }
            else
                start = par + 1;
            par = partition(array, start, end);
        }
        System.out.println(par);
        if (isMoreThanHalf(array,array[par])) {
            return array[par];
        }
        return 0;
    }

    private int partition(int[] array, int start, int end) {
        Random random = new Random();
        int index = random.nextInt(end - start + 1) + start;
        swap(array, index, end);
        int small = start - 1;
        index = start;
        for (;index < end; index++) {
            if (array[index] < array[end]){
                small++;
                if (index!=small) {
                    swap(array, index, small);
                }
            }

        }
        small++;
        swap(array, small, end);

        return small;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean isMoreThanHalf(int[] array, int num) {
        int times = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                times++;
        }
        return times * 2>array.length;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        MoreThanHalfNum moreThanHalfNum = new MoreThanHalfNum();
        System.out.println(moreThanHalfNum.MoreThanHalfNum_Solution(array));
    }
}
