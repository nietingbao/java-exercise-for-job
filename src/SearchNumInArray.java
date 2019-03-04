public class SearchNumInArray {
//    boolean search(int[][] a, int x, int columns, int rows) {
//        int j = columns - 1;
//        while (a[0][j] > x) {
//            j--;
//        }
//        int i = 0;
//        if(a[i][j] == x) return true;
//        while (j >= 0) {
//            while(a[i][j] < x && i < rows - 1){
//                ++i;
//            }
//            if(a[i][j] < x && j == columns-1) return false;
//            if (a[i][j] == x) return true;
//            else {
//                i = 0;
//                --j;
//            }
//        }
//        return false;
//
//    }
//
//    boolean search2(int[][] a, int x, int columns, int rows) {
//        if(x < a[0][0] || x > a[rows - 1][columns - 1]) {
//            return false;
//        }
//        int j = columns -1;
//        while (a[0][j] > x)
//            --j;
//        int k = j;
//
//        for (int i = 0; i < rows ; ++i) {
//            if (a[i][j] == x) return true;
//            if (a[i][j] < x) continue;
//            if (a[i][j] > x) {
//                while (a[i][j] > x&& j > 0) {
//                    --j;
//                }
//
//                if (a[i][j] == x) return true;
//
//                else {
//                    j = k;
//                }
//            }
//        }
//        return false;
//    }
    public static void main(String[] args) {
        int[][] a = {
                {1,2,5},
                {3,6,9},
                {7,8,10}
        };
        int[][] b = {};
        SearchNumInArray searchNumInArray = new SearchNumInArray();
        System.out.println(searchNumInArray.Find(11,b));
    }

    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从
    // 左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    // 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中
    // 是否含有该整数。
    public boolean Find(int target, int [][] array) {
        //如何找到array的rows和columns？
        //array.length表示columns.
        //array[0].length表示rows.
        int rows = array.length;
        if (rows == 0) return false;
        int columns = array[0].length;
        if (columns == 0) return false;
        int j = 0;
        while (target > array[j][rows - 1] && j < columns - 1) {
            ++j;
        }
        if (j > columns - 1) return false;
        if (target == array[j][rows - 1]) return true;
        int i = rows - 2;
        //保留j，列的值
        int k = j;
        while (i >= 0) {
            while (target > array[j][i] && j < columns - 1) {
                j++;
            }
            if (target == array[j][i]) return true;
            else {
                j = k;
                --i;
            }
        }
        return false;
    }
}
