public class Multiply {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        int[] BFront = new int[A.length];
        int[] BBack= new int[A.length];
        BFront[0] = 1;
        BBack[A.length - 1] = 1;
        if (A.length == 0)
            return A;
        if (A.length==1)
            return new int[]{};
        for (int i = 1; i < A.length; i++) {
            if (i == 1)
                BFront[i] = A[0];
            BFront[i] = BFront[i-1] * A[i-1];
        }
        for (int i = A.length -2; i >= 0 ; i--) {
            if (i == A.length - 2)
                BBack[i] = A[A.length - 1];
            BBack[i] = BBack[i+1] * A[i + 1];
        }
        for (int i = 0; i < A.length; i++) {
            B[i] = BFront[i] * BBack[i];
        }
        return B;
    }
}
