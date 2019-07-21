package ca.jrvs.challenge;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    // Method to add a new node at tail
    public static ListNode add(ListNode head, int val)
    {
        // Create a new node with given data
        ListNode new_node = new ListNode(val);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return head;
    }

    // Method to print the LinkedList.
    public static void printList(ListNode head)
    {
        ListNode currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.val + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}
