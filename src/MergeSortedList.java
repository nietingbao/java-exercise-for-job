public class MergeSortedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode pIndex1 = list1;
        ListNode pIndex2 = list2;
        ListNode newHead;
        ListNode newListIndex;
        //先把头找到；
        if (pIndex1.val <= pIndex2.val) {
            newHead = new ListNode(pIndex1.val);
            pIndex1 = pIndex1.next;
        }
        else {
            newHead = new ListNode(pIndex2.val);
            pIndex2 = pIndex2.next;
        }
        newListIndex = newHead;
        while (pIndex1 != null && pIndex2 != null) {
            if (pIndex1.val <= pIndex2.val) {
                ListNode newNode = new ListNode(pIndex1.val);
                newListIndex.next = newNode;
                newListIndex = newNode;
                pIndex1 = pIndex1.next;
            }
            else {
                ListNode newNode = new ListNode(pIndex2.val);
                newListIndex.next = newNode;
                newListIndex = newNode;
                pIndex2 = pIndex2.next;
            }
        }
        if (pIndex1 == null && pIndex2 != null) {
            while (pIndex2 != null) {
                newListIndex.next = pIndex2;
                newListIndex = pIndex2;
                pIndex2 = pIndex2.next;
            }
        }

        if (pIndex2 == null && pIndex1 != null) {
            while (pIndex1 != null) {
                newListIndex.next = pIndex1;
                newListIndex = pIndex1;
                pIndex1 = pIndex1.next;
            }
        }

        return newHead;

    }
}
