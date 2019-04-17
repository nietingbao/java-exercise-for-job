import java.util.HashMap;

public class NumberOf1Between1AndN {
    private int num = 0;
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n == 0)
            return 0;
        if ( n >= 1 &&  n < 10) {
            return 1;
        }
        else {
            int flag = 10;
            while (n >= flag) {
                flag *= 10;
            }

            //查看n最高位的数字,flag/10与n同位数，以21345为例，flag/10也是五位数
            int highest = n / (flag/10);
            if (highest > 1) {
                num = flag/10 +//如果高位大于1，那么10000-19999之间这些都有一个1
                        highest * NumberOf1Between1AndN_Solution(flag/10 - 1)//1-9999之间有多少个1
                        + NumberOf1Between1AndN_Solution(n - highest * flag/10);//剩下的20000-21345有多少个1
            }
            else {
                num = n - flag/10 + 1 +//剩下那一截有多少个数就有多少个1，如1345的1000到1345部分
                        highest * NumberOf1Between1AndN_Solution(flag/10 - 1) +//1-999部分
                        NumberOf1Between1AndN_Solution(n - flag/10);//剩下的345也要计算一次
            }

        }
        return num;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        System.out.println(map.put(1,2));
    }
}
