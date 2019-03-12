import java.util.Stack;

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Stack<Integer> listStack = new Stack<>();
        ListNode pNode = head;
        while (pNode != null) {
            listStack.push(pNode.val);
            pNode = pNode.next;
        }
        ListNode newHead = new ListNode(listStack.pop());
        ListNode newPNode = newHead;
        while (!listStack.isEmpty()) {
            ListNode newNode = new ListNode(listStack.pop());
            newPNode.next = newNode;
            newPNode = newNode;
        }
        return newHead;
    }
}
