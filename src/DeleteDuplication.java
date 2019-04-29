public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode p1 = pHead;
        ListNode pre = pHead;
        ListNode back = pHead;
        while (p1.next!=null) {
            if (p1==pHead){
                while (p1.next!=null&&p1.val == p1.next.val){//一直找到值不一样的
                    pre = p1;
                    p1 = p1.next;
                }
                if (p1.next==null)
                    return null;
                else {
                    p1 = p1.next;
                    pHead = p1;
                    pre = p1;
                }
            }
            else {
                while (p1.next!=null&&p1.val == p1.next.val){//一直找到值不一样的
                    pre = p1;
                    p1 = p1.next;
                }
                if (p1.next==null)
                    return pHead;
                else {

                }
            }
        }
        return pHead;
    }
}
