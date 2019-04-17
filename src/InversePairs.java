public class InversePairs {
    //此方法时间复杂度过高，如何用归并排序？
    public int InversePairs(int [] array) {
        if (array.length == 0||array.length == 1)
            return 0;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            while (j < i) {
                if (array[j] > array[i])
                    count++;
                j++;
            }
        }
        return count%1000000007;
    }

    private static int count = 0;
    public int InversePairs2(int [] array) {
        getCount(array,0, array.length - 1);
        return count;
    }

    private void getCount(int [] array, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            getCount(array, left, mid);
            getCount(array, mid + 1, right);
            merge(array,left,mid,right);

        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[right- left+1];
        int p1 = left;
        int p2 = mid + 1;
        int k = 0;
        while (p1 <= mid&&p2 <= right) {
            if (array[p1] <= array[p2])
                tmp[k++] = array[p1++];
            else{
                tmp[k++]= array[p2++];
                count += mid - p1+1;
            }

        }
        while (p1<=mid)
            tmp[k++] = array[p1++];
        while (p2<=right)
            tmp[k++] =array[p2++];
        for (int l = 0; l < tmp.length; l++) {
            array[left+l] = tmp[l];
        }
    }


    public static void main(String[] args) {
        InversePairs i = new InversePairs();
        int [] a = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,
                505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,
                162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,
                478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,
                266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(i.InversePairs2(a));
    }
}
