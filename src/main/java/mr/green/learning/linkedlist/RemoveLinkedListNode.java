package mr.green.learning.linkedlist;

public class RemoveLinkedListNode {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                // Удаляю узел путем изменения ссылки!
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}


