public class Test {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = new Integer(5);
        String s = new String("sda");
        String t = "sda";
        s = s.intern();
        System.out.println(s == t.intern());
        System.out.println(a.equals(b));
    }
}
