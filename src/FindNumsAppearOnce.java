public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int res = 0;
        for (int a:array
             ) {
            res^=a;
        }
        int flag = 1;
        int index = 1;//表示第一位
        while ((res & flag) == 0) {
            flag<<=1;
            index++;
        }
        for (int i = 0; i < array.length; i++) {
            if (IndexIs1(array[i], index))
                num1[0] ^= array[i];
            else num2[0] ^= array[i];
        }


    }
    
    private boolean IndexIs1(int num,int index) {
        return ((num>>(index - 1))&1)==0;
    }
}
