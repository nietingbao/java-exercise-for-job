import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Stack;

public class PrintListReversely {
    public ArrayList<Integer> printFromTailtoHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}




