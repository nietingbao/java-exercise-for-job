import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

public class Sort {
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            for (int j = array.length - 1; j > i ; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }

    }

    public void quickSort(int[] array, int start, int end) {
        if (start == end) return;
        int index = partition(array, start, end);
        if (index < end) quickSort(array, index + 1, end);
        if (index > start) quickSort(array, start, index - 1);
    }
    private int partition(int[] array, int start, int end) {
        Random random = new Random();
        //nextInt(bound)是生成从0到bound之间的数字
        int index = random.nextInt(end - start + 1) + start;
        swap(array, index, end);

        int small = start - 1;
        for (index = start; index < end; index++) {
            if (array[index] < array[end]) {
                small ++;
                if(index != small)
                    swap(array, index, small);
            }
        }
        small++;
        swap(array, small, index);
        return small;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start+end)/2;
            mergeSort(a, start, mid);
            mergeSort(a,mid+1, end);
            merge(a, start, mid, end);
        }
    }

    private void merge(int[] a, int start,int mid, int end) {
        int[] tmp = new int[a.length];
        int p1 = start;
        int p2 = mid+1;
        int k = start;
        while (p1 <= mid&&p2 <= end) {
            if (a[p1] < a[p2])
                tmp[k++] = a[p1++];
            else tmp[k++] = a[p2++];
        }
        while (p1<=mid)
            tmp[k++] = a[p1++];

        while (p2<=end)
            tmp[k++] = a[p2++];

        for (int i = start; i <=end; i++) {
            a[i] = tmp[i];
        }
        //a = Arrays.copyOfRange(tmp,0,tmp.length);


    }
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] a = {1,5,8,9,6,4,3,4,7,1};
        int[] c = a;//这里直接是同一个引用，因此当a变的时候，c也会变
        sort.mergeSort(a,0,a.length-1);

        for (int b:a
             ) {
            System.out.print(b);
        }

    }
}
