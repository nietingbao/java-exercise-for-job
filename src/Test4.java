public class Test4 {

    public class Student{}
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");



        System.out.println("Before change, sb = " + sb);

        System.out.println(sb.charAt(sb.length() - 1));


        System.out.println("After changeData(n), sb = " + sb);

    }

    public static void change(StringBuilder s){
        s = new StringBuilder("aa");
        System.out.println();
    }



}
