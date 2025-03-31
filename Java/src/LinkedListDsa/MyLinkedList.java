package LinkedListDsa;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(-1);  // Dummy head node
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode current = head;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) index = 0;
        if (index > size) return;

        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(20);
        list.addAtTail(10);
        list.addAtIndex(1, 15);
        list.deleteAtIndex(0);
        System.out.println("Value at index 1: " + list.get(1));  // Output: 20
    }
}

