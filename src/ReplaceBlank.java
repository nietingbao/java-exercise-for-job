public class ReplaceBlank {
    static String replace(char[] a, int length) {
        if (a == null || length <= 0) {
            return null;
        }
        int newLength;
        int numOfBlank = 0;
        for (char c:a
             ) {
            if(c == ' ')
                numOfBlank ++;
        }
        newLength = length + 2 * numOfBlank;
        int indexOfOrigin = length - 1;
        int indexOfNew = newLength - 1;
        char[] b = new char[newLength];
        for(;indexOfOrigin >= 0; indexOfOrigin--) {
            if (a[indexOfOrigin] == ' ') {
                b[indexOfNew--] = '0';
                b[indexOfNew--] = '2';
                b[indexOfNew--] = '%';
            }
            else {
                b[indexOfNew--] = a[indexOfOrigin];
            }
        }
        //将字符数组转换为字符串，直接用构造方法
        return new String(b);
     }

    public static void main(String[] args) {
        String a = "wewew";
        System.out.println(replace(a.toCharArray(), a.length()));

    }
}
