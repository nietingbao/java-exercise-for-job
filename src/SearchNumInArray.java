public class SearchNumInArray {
    boolean search(int[][] a, int x, int columns, int rows) {
        int j = columns - 1;
        while (a[0][j] > x) {
            j--;
        }
        int i = 0;
        if(a[i][j] == x) return true;
        while (j >= 0) {
            while(a[i][j] < x){
                ++i;
            }
            System.out.println(i);
            if (a[i][j] == x) return true;
            else {
                i = 0;
                --j;
            }
            return false;
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
        System.out.println(searchNumInArray.search(a,6,3,3));
    }
}
