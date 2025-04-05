package LinkedListDsa;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;

        if (head == null) return null;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;

            if (sp == fp) {
                sp = head;
                while (sp != fp) {
                    sp = sp.next;
                    fp = fp.next;
                }
                return sp;
            }
        }
        return null;
    }
}
