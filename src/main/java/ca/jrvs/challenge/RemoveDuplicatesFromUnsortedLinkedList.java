package ca.jrvs.challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove duplicates from an unsorted linked list
 * <p>
 * Example:
 * If the linked list is 12->11->12->21->41->43->21,
 * then removeDuplicates() should convert the list to 12->11->21->41->43.
 */
public class RemoveDuplicatesFromUnsortedLinkedList {
    public static ListNode removeDuplicate(ListNode head) {
        // Hash to store seen values
        Set<Integer> hashSet = new HashSet<>();

        /* Pick elements one by one */
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            int curval = current.val;

            // If current value is seen before
            if (hashSet.contains(curval)) {
                prev.next = current.next;
            } else {
                hashSet.add(curval);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
