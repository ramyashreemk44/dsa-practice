package LinkedListDsa;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0, null);
        ListNode temp = dummy;
        ListNode l1 = list1;
        ListNode l2 = list2;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        temp.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortedLists solver = new MergeTwoSortedLists();
        ListNode result = solver.mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 1 1 2 3 4 4
    }
}
