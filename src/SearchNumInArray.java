public class SearchNumInArray {
    boolean search(int[][] a, int x, int columns, int rows) {
        int j = columns - 1;
        while (a[0][j] > x) {
            j--;
        }
        int i = 0;
        if(a[i][j] == x) return true;
        while (j >= 0) {
            while(a[i][j] < x && i < rows - 1){
                ++i;
            }
            if(a[i][j] < x && j == columns-1) return false;
            if (a[i][j] == x) return true;
            else {
                i = 0;
                --j;
            }
        }
        return false;

    }

    boolean search2(int[][] a, int x, int columns, int rows) {
        if(x < a[0][0] || x > a[rows - 1][columns - 1]) {
            return false;
        }
        int j = columns -1;
        while (a[0][j] > x)
            --j;
        int k = j;

        for (int i = 0; i < rows ; ++i) {
            if (a[i][j] == x) return true;
            if (a[i][j] < x) continue;
            if (a[i][j] > x) {
                while (a[i][j] > x&& j > 0) {
                    --j;
                }

                if (a[i][j] == x) return true;

                else {
                    j = k;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = {
                {1,2,5},
                {3,6,9},
                {7,8,10}
        };
        SearchNumInArray searchNumInArray = new SearchNumInArray();
        System.out.println(searchNumInArray.search(a,7,3,3));
        System.out.println(searchNumInArray.search2(a,8, 3,3));
    }
}
