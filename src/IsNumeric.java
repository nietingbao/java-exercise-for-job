public class IsNumeric {
    public boolean isNumeric(char[] str) {
        int numOfPoint = 0;
        int numOfE = 0;
        if (str.length == 0)
            return false;
        int i = 0;
        boolean hasSymInFront = false;
        if (str[0] == '+' || str[0] == '-') ;
        {//遇到加减号先往后走，后面不允许再有，直到遇到e
            i++;
            hasSymInFront = true;
        }

        while (i < str.length) {
            if (!isValid(str[i]))
                return false;
            if (isNum(str[i]))

            if (isSym(str[i])) {
                if (!(i > 0 && str[i - 1] == 'e'))
                    return false;

            }
            if (numOfE > 1)
                return false;
            if (numOfPoint > 1)
                return false;
            if (str[i] == '.') {
                if (numOfE == 1)
                    return false;
                numOfPoint++;
                if (hasSymInFront && i == 1)//前面没有数字
                    return false;
                if (!hasSymInFront && i == 0)
                    return false;
                if (i == str.length - 1)//后面没有数字
                    return false;

            }
            if (str[i] == 'e') {
                numOfE++;
                if (hasSymInFront && i == 1)//前面没有数字
                    return false;
                if (!hasSymInFront && i == 0)
                    return false;
                if (i == str.length - 1)//后面没有数字
                    return false;

            }
            i++;
        }
        return true;
    }


    private boolean isValid(char a){
        return (a >= '0'&&a<='9')||a=='+'||a=='-'||a=='e';
    }

    private boolean isNum(char a){
        return (a >= '0'&&a<='9');
    }

    private boolean isSym(char a) {
        return a=='+'||a=='-';
    }

    public static void main(String[] args) {
        IsNumeric i = new IsNumeric();
        String a = "100";
        char[] c = a.toCharArray();
        System.out.println(i.isNumeric(c));
    }
}
