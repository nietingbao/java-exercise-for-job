public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        ReverseSentence r = new ReverseSentence();
        char[] chars = str.toCharArray();
        r.reverse(chars, 0, n-1);
        r.reverse(chars, n, chars.length-1);
        r.reverse(chars,0,chars.length-1);
        return String.valueOf(chars);
    }

}
