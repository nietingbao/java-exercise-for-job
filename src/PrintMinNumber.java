import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        //把所有的数字放入集合中，在集合中使用自定义的排序规则定义两个数的大小，这里使用两个数的字符串形式来比较
        ArrayList<Integer> list = new ArrayList<>();
        if (numbers.length == 0)
            return "";
        for (int i:numbers
             ) {
            list.add(i);
        }
        Collections.sort(list, (o1, o2) -> {
            String s1 = o1+""+o2;
            String s2 = o2 + "" + o1;
            return s1.compareTo(s2);
        });
        String res = "";
        for (Integer i:list
             ) {
            res += i;
        }
        return res;
    }
}
