import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

//求最小的k个数
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k>input.length)
            return new ArrayList<>();
        if(k<= 0)
            return new ArrayList<>();
        int start = 0;
        int end = input.length - 1;
        int index = partition(input, start, end);
        while (index != k-1) {
            if (index > k-1)
                end = index - 1;
            else start = index + 1;
            index = partition(input, start, end);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
    private int partition(int[] array, int start, int end) {
        Random random = new Random();
        int index = new Random().nextInt(end - start + 1) + start;
        swap(array, index, end);
        int small = start - 1;
        for (index = start; index < end; index ++) {
            if (array[index] < array[end]) {
                small ++;
                if (index != small)
                    swap(array, index, small);
            }
        }
        small++;
        swap(array,small,end);
        return small;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k > input.length||k == 0)
            return res;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (i,j) -> j.compareTo(i));
        for (int i = 0; i < input.length; i++) {
            if (queue.size() < k) {
                queue.offer(input[i]);
            }
            else {
                if (input[i] < queue.peek()) {
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }

        for (Integer i:queue
             ) {
            res.add(i);
        }
        return res;
    }
}
