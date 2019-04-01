import java.util.ArrayList;
    import java.util.Collections;

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> strings = new ArrayList<>();
        char[] chars = str.toCharArray();
        permute(strings,chars, 0);
        Collections.sort(strings);
        return strings;
    }

    private void permute(ArrayList<String> strings, char[] chars, int i) {
        if (i == chars.length - 1) {
            String val = String.valueOf(chars);
            if (!strings.contains(val))
                strings.add(val);
        }
        for (int j = i; j < chars.length; ++j) {
            swap(chars, i, j);
            permute(strings, chars, i+1);
            swap(chars, i, j);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
