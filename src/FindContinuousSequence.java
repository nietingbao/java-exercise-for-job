import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int small = 1;
        int big = 2;
        ArrayList<Integer> current = new ArrayList<>();
        current.add(small);
        current.add(big);
        int currentSum = small + big;
        while (big > small&&big <= (sum + 1)/2) {
            if (currentSum < sum) {
                current.add(++big);
                currentSum+=big;
            }
            else if (currentSum == sum) {
                ArrayList<Integer> list = new ArrayList<>(current);
                res.add(list);
                current.remove(0);
                currentSum -= small++;
            }
            else {
                current.remove(0);
                currentSum -= small++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindContinuousSequence f = new FindContinuousSequence();
        System.out.println(f.FindContinuousSequence(9));
    }
}
