import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        if (a == b)
            System.out.println("a == b");
        else System.out.println("a != b");
        if (a.equals(b))
            System.out.println("a.equals(b)");
        else System.out.println("!a.equals(b)");
        HashMap<String, Integer> map = new HashMap<>();
        map.put(a,1);
        map.put(b,2);
        System.out.println(map.get(a));
        System.out.println(map.get(b));
    }
}
