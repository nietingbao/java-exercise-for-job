public class ReplaceBlank {
    static public String replaceSpace(StringBuffer str) {
        if (str == null) return null;
        int numOfBlank = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                numOfBlank++;
            }
        }
        int newLength = str.length() + 2 * numOfBlank;
        int indexOfOrigin = str.length() - 1;
        int indexOfNew = newLength - 1;
        str.setLength(newLength);
        for(;indexOfOrigin >= 0 && indexOfOrigin < newLength; --indexOfOrigin) {
            if (str.charAt(indexOfOrigin) == ' ') {
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
            }
            else {
                str.setCharAt(indexOfNew--,str.charAt(indexOfOrigin));
            }
        }
        //将字符数组转换为字符串，直接用构造方法
        return str.toString();
    }
    public static void main(String[] args) {
        String a = "hello world";
        StringBuffer b = new StringBuffer(a);
        System.out.println(replaceSpace1(b));


    }

    public static String replaceSpace1(StringBuffer str) {
        int countOfBlank = 0;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == ' ')
                countOfBlank++;
        //设置长度之前，找到末尾的位置；
        int p1 = str.length() -1;
        str.setLength(str.length() + 2 * countOfBlank);
        int p2 = str.length() - 1 ;
        while(p1 >= 0){
            if(str.charAt(p1--) == ' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2') ;
                str.setCharAt(p2--,'%');
            }
            while(p1 >= 0&&str.charAt(p1) != ' '){
                str.setCharAt(p2,str.charAt(p1));
                p2--;
                p1--;
            }
        }
        return String.valueOf(str);
    }
}
