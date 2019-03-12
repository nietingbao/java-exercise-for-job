public class KthNode {
    public ListNode FindKthToTail(ListNode head,int k) {
        int length = 0;
        ListNode p = head;
//        while (p != null) {
//            length++;
//            p = p.next;
//        }
        //空指针可能出现，或者是k等于0的情况也可能出现
        if (k <= 0 || head == null)
            return null;
//        if (k > length)
//            return null;
        else {
            ListNode pFirst = head;
            ListNode pSecond = head;
            int i = k - 1;
            while (i > 0) {
                pFirst = pFirst.next;
                i--;
            }
            //如果k比较大，溢出了，则报错
            if (pFirst == null)
                return null;
            while (pFirst.next != null) {
                pFirst = pFirst.next;
                pSecond = pSecond.next;
            }
            return pSecond;
        }

    }
}
