public class IsMatch {
    public boolean match(char[] str, char[] pattern)
    {
        int p1 = 0;
        int p2 = 0;
        int p3;
        while (p1 < str.length&p2<pattern.length) {
            if (str[p1] == pattern[p2]) {//如果相等，可能是pattern也可能后面有*
                //查看pattern后面是否有*
                p3 = p2 + 1;
                if (pattern[p3] == '*'){//可以匹配str中任意多个
                    char tmp = str[p1];
                    while (p1 < str.length&&str[p1] == tmp)
                        p1++;
                    p2 = p3+1;
                }
                else {
                    p2++;
                    p1++;
                }
            }
            else if (str[p1]!=pattern[p2] && pattern[p2]!='.'&&pattern[p2]!='*')
                return false;
            else if (str[p1]!=pattern[p2] && pattern[p2]=='.'){
                p3 = p2+1;
                if (p3 < pattern.length&&pattern[p3]=='*'){
                    p1++;
                    p2 = p3+1;
                }
                p1++;
                p2++;
            }
        }
        if (p1<str.length-1)
            return false;
        if (pattern.length - p2 >0){//pattern后面还有
            while (p2 < pattern.length) {
                p3 = p2 + 1;
                if (p3 >= pattern.length)
                    return false;
                if (pattern[p3] == '*'){
                    p2 = p3+1;
                }
            }
        }
        return true;
    }
}
