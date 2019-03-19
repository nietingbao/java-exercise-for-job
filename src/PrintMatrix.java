import java.util.ArrayList;
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        printReversely(matrix, result, left, right, top, bottom);
        return result;
    }

    private void printReversely(int[][] matrix, ArrayList<Integer> result, int left, int right, int top, int bottom) {
        if ((right > left && bottom > top)){
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom ; i++) {
                result.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left ; i--) {
                result.add(matrix[bottom][i]);
            }
            for (int i = bottom - 1; i > top; i--) {
                result.add(matrix[i][left]);
            }
        }
        else if (right == left&& bottom > top) {
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][left]);
            }
        }
        else if (right > left&&bottom == top) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[bottom][i]);
            }
        }
        else if (bottom==top&&right == left)
            result.add(matrix[top][left]);
        if (left > right|| top > bottom)
            return;
        printReversely(matrix, result, left + 1, right - 1, top + 1, bottom - 1);
    }
}
