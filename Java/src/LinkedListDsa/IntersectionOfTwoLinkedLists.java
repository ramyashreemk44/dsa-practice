package LinkedListDsa;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a != null) a = a.next; else a = headB;
            if (b != null) b = b.next; else b = headA;
        }
        return a;
    }

    public static void main(String[] args) {
        // Example intersection setup
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        IntersectionOfTwoLinkedLists solver = new IntersectionOfTwoLinkedLists();
        ListNode result = solver.getIntersectionNode(headA, headB);

        System.out.println("Intersection at node with value: " + (result != null ? result.val : "null"));
    }
}

