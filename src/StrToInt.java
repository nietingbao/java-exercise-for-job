public class StrToInt {
    public int StrToInt(String str) {
        char[] chars = str.toCharArray();
        int falseFlag = 0;
        int minus = 0;
        long num = 0;
        if (str == null||str.equals("0")) {
            return 0;
        }
        if (chars[0] == '-'){
            minus = 1;
            num = strToInt(chars, 1, minus);
        }

        else if (chars[0] == '+')
            num = strToInt(chars, 1,minus);
        else num = strToInt(chars, 1,minus);
        return (int) num;
    }

    private long strToInt(char[] chars, int start, int minus) {
        int i = start;
        long num = 0;
        while (i < chars.length) {
            if (chars[i] > '9'||chars[i] < '0')
                return 0;
            while (i < chars.length&&chars[i] == '0')//找到第一个非0的
                i++;
            num = num * 10 + chars[i];
            i++;
        }
        if (minus==1)
            return 0-num;
        else return num;
    }
}
