package LinkedListDsa;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(6,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6)))))));

        RemoveLinkedListElements solver = new RemoveLinkedListElements();
        ListNode result = solver.removeElements(head, 6);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 1 2 3 4 5
    }
}
