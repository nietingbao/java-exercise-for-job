import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int front = 0;
        int end = array.length - 1;
        while (end > front) {
            if ((array[end] + array[front]) <sum){
                front++;
            }
            else if ((array[end] + array[front]) == sum){
                res.add(array[front]);
                res.add(array[end]);
                return res;
            }else {
                end--;
            }
        }
        return res;
    }
}
