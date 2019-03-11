public class Fibonacci {
    public int Fibonacci(int n) {
        int[] result = {0 ,1};
        if (n < 2) {
            return result[n];
        }
        long fFirst = 0;
        long fSecond = 1;
        long fIntermediate = 0;
        for (int i = 2; i <= n; i++) {
            fIntermediate = fFirst + fSecond;
            fFirst = fSecond;
            fSecond = fIntermediate;
        }
        return (int) fIntermediate;
    }
}
