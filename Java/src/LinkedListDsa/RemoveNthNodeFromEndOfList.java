package LinkedListDsa;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        RemoveNthNodeFromEndOfList solver = new RemoveNthNodeFromEndOfList();
        ListNode result = solver.removeNthFromEnd(head, 2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
