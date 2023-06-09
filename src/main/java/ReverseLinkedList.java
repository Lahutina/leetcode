/*
https://leetcode.com/problems/reverse-linked-list/description/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}