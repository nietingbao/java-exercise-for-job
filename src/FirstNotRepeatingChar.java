import java.util.*;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char c:chars
             ) {
            if (map.containsKey(c)) {
                int times = map.get(c);
                map.put(c,++times);
            }
            else map.put(c,1);
        }

        int pos = -1;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(chars[i]) == 1)
                return i;//第一个
        }
        return pos;
    }
}
