import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if (size>num.length)
            return null;
        int[] maxIndex = new int[num.length-size+1];
        ArrayList<Integer> res = new ArrayList<>();
        int beginIndex = 0;
        int max = getMax(num, beginIndex, size,maxIndex);//算出第一个窗口的最大值以及索引
        System.out.println(maxIndex[0]);
        res.add(max);
        while (beginIndex < num.length - size) {
            beginIndex++;
            //先判断是否新的值更大
            if (num[beginIndex+size -1] > max) {
                max = num[beginIndex+size -1];
                res.add(max);
                maxIndex[beginIndex] = beginIndex+size -1;
            }
            else if (beginIndex > maxIndex[beginIndex-1]){//如果过期，则重新找最大值'
                System.out.println("ss");
                max = getMax(num,beginIndex,size,maxIndex);
                System.out.println(max);
                res.add(max);
            }
            else {//未过期，而且新的值也小，用以前的max
                res.add(res.get(beginIndex - 1));
                maxIndex[beginIndex] = maxIndex[beginIndex - 1];
            }
        }
        for (int a:maxIndex
             ) {
            System.out.print(a);
        }
        return res;
    }

    //顺序查找最大值，并把最大值索引放在索引数组中
    private int getMax(int[] num, int beginIndex, int size,int[] maxIndex) {
        int max = num[beginIndex];
        int i = 0;
        int j = i;
        for (; i < size; i++) {
            if (num[i+beginIndex] > max){
                max = num[i+beginIndex];
                j = i;
            }

        }
        maxIndex[beginIndex] = j;
        return max;

    }

    public static void main(String[] args) {
        MaxInWindows m = new MaxInWindows();
        int[] num = {16,14,12,10,8,6,4};
        System.out.println(m.maxInWindows(num,5));
    }
}
