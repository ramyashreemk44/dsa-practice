package LinkedListDsa;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode sn = head;
        ListNode fn = head;

        while (fn != null && fn.next != null) {
            fn = fn.next.next;
            sn = sn.next;
            if (sn == fn) return true;
        }

        return false;
    }

}

