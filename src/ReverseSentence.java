public class ReverseSentence {
    public String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length - 1);
        int i = 0;
        while (i < chars.length) {
            while (i < chars.length&&chars[i]==' ')
                i++;
            int start = i;
            while (i < chars.length&&chars[i] != ' ')
                i++;
            int end = i - 1;
            reverse(chars, start, end);
        }

        return String.valueOf(chars);
    }

    public void reverse(char[] chars, int start, int end){
        int left = start;
        int right = end;
        while (right > left) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            right--;
            left++;
        }
    }

    public static void main(String[] args) {
        ReverseSentence r = new ReverseSentence();
        System.out.println(r.ReverseSentence("I am a student."));
    }
}
