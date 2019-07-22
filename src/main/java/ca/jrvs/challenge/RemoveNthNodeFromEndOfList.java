package ca.jrvs.challenge;

/**
 * 19. Remove Nth Node From End of List
 * <p>
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * Given n will always be valid.
 */
public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode faster = fakeHead;
        ListNode slower = fakeHead;
        for (int i = 0; i <= n; i++) {
            faster = faster.next;
        }

        while (faster != null) {
            slower = slower.next;
            faster = faster.next;
        }
        slower.next = slower.next.next;
        return fakeHead.next;
    }
}
