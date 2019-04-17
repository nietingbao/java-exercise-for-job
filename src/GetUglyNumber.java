public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0)
            return 0;
        int[] uglyNum = new int[index];
        uglyNum[0] = 1;
        int ugly2 = 0;
        int ugly3 = 0;
        int ugly5 = 0;
        int uglyIndex = 1;
        while (uglyIndex < index) {
            while (uglyNum[ugly2] *2 <= uglyNum[uglyIndex - 1])
                ugly2++;
            while (uglyNum[ugly3] *3 <= uglyNum[uglyIndex - 1])
                ugly3++;
            while (uglyNum[ugly5] * 5<= uglyNum[uglyIndex - 1])
                ugly5++;

            uglyNum[uglyIndex++] = min(uglyNum[ugly2] *2,uglyNum[ugly3]*3 , uglyNum[ugly5]*5);//这里的最小值是丑数，而不是索引的最小值
        }
        return uglyNum[index-1];
    }

    private int min(int u1, int u2, int u3) {
        int min = u1  > u2  ?u2:u1;
        return min > u3 ? u3 : min;
    }
}
