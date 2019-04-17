import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        quickSort(numbers,0, numbers.length -1);
        int numsOf0 = 0;
        int small = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                numsOf0++;
            else {
                small = i;
                break;
            }
        }
        int big = small+1;
        //统计间隔,用数字表示
        int gap = 0;
        while (big<numbers.length) {
            if (numbers[big] - numbers[small] == 0)
                return false;
            else {
                gap += (numbers[big] - numbers[small] - 1);
            }
            big++;
            small++;
        }
        System.out.println(gap);
        return !(gap > numsOf0);
    }

    private void quickSort(int[] num,int start, int end){
        if (start == end)
            return;
        int index = partition(num,start,end);
        if (index < end)
            quickSort(num, index+1, end);
        if (index > start)
            quickSort(num,start,index-1);
    }

    private int partition(int[] num, int left, int right){
        Random random = new Random();
        int index = random.nextInt(right - left+ 1) + left;
        swap(num,index,right);
        int small = left - 1;
        for (index = left;index < right;index++) {
            if (num[index] < num[right]){
                small++;
                if (small!=index)
                    swap(num,small,right);
            }
        }
        small++;
        swap(num, small, right);
        return small;
    }

    private void swap(int[] num,int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    public static void main(String[] args) {
        IsContinuous a = new IsContinuous();
        int[] n = {1,3,0,5,0};
        System.out.println(a.isContinuous(n));
    }
}
