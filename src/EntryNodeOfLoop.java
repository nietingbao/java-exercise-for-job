import java.util.HashSet;
import java.util.Set;

public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        Set<ListNode> set = new HashSet<>();
        if (pHead == null)
            return null;
        while (pHead!=null){
            if (!set.contains(pHead))
                set.add(pHead);
            else return pHead;
            pHead = pHead.next;
        }
        return null;
    }
}
