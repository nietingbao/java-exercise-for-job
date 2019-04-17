import java.util.Stack;

public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        if (pHead1==null||pHead2==null)
            return null;
        while (pHead1!=null) {
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2!=null){
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        if (stack1.peek()!=stack2.peek())
            return null;
        ListNode n1 = stack1.pop();
        ListNode n2 = stack2.pop();
        ListNode res = null;
        while (n1==n2&&stack1!=null&&stack2!=null) {
            res = n1;
            n1 = stack1.pop();
            n2 = stack2.pop();
        }
        return res;
    }

    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null||pHead2==null)
            return null;
        int length1 = getLength(pHead1);
        int length2 = getLength(pHead2);
        if (length1 > length2) {//如果第一条长，就先走一步
            int k = length1 - length2;
            while (k>0){
                pHead1 = pHead1.next;
                k--;
            }
        }
        else {
            int k = length2 - length1;
            while (k > 0){
                pHead2 = pHead2.next;
                k--;
            }
        }
        //两个同步了，再往后面走
        while (pHead1.next!=pHead2.next&&pHead1.next!=null){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        if (pHead1.next == null)
            return null;
        return pHead1.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
}
