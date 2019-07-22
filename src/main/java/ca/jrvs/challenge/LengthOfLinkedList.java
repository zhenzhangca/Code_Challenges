package ca.jrvs.challenge;

/**
 * Find the length of a singly linked list
 */
public class LengthOfLinkedList {
    public static int getLength(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
