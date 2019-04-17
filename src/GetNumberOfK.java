public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int times = 0;
        int index = searchK(array,k,0,array.length - 1);//二分搜索k的索引
        System.out.println(index);
        if (index == -1)
            return 0;
        if (index == 0) {
            times++;
            for (int i = index+1; i < array.length; i++) {
                if (array[i] == k)
                    times++;
            }
        }
        else if (index == array.length-1){
            times++;
            for (int i = index-1; i >=0 ; i++) {
                if (array[i] == k)
                    times++;
            }
        }
        else {
            times++;
            for (int i = index+1; i < array.length; i++) {
                if (array[i] == k)
                    times++;
            }
            for (int i = index-1; i >=0 ; i--) {
                if (array[i] == k)
                    times++;
            }
        }

        return times;
    }

    private int searchK(int[] array, int k, int start, int end){
        int index = -1;
        if (end==start)
            if (array[start] == k)
                return start;
        if (end > start) {
            int mid = (end +start)/2;
            if (array[mid] == k)
                return mid;
            index = searchK(array, k, start, mid);
            if (index == -1)
                index = searchK(array,k,mid+1, end);
        }
        return index;
    }

    public static void main(String[] args) {
        GetNumberOfK g = new GetNumberOfK();
        int[] a = {3};
        System.out.println(g.GetNumberOfK(a,3));
    }
}
