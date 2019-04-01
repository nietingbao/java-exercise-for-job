public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0)
            return 0;
        int sum = array[0];
        int MaxSum = array[0];
        for (int j = 0; j < array.length; j++) {
            //这里是对上一个步骤的判断；很多循环的都存在这样的情况，就是说这次判断的条件是在上次运算得到的
            // 那么，对这个sum的计算可能是在下面的语句中计算得到的
            if (sum < 0)
                sum = array[j];
            else sum += array[j];
            if (sum > MaxSum)
                MaxSum = sum;
        }

        return MaxSum;
    }

    public static void main(String[] args) {
        FindGreatestSumOfSubArray findGreatestSumOfSubArray = new FindGreatestSumOfSubArray();
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        int max = findGreatestSumOfSubArray.FindGreatestSumOfSubArray(arr);
        System.out.println(max);
    }
}
