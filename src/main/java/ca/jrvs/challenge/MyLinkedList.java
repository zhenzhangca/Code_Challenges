package ca.jrvs.challenge;

/**
 * 707. Design Linked List
 * <p>
 * Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement these functions in your linked list class:
 * <p>
 * get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
 * addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * addAtTail(val) : Append a node of value val to the last element of the linked list.
 * addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. If index is negative, the node will be inserted at the head of the list.
 * deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 * <p>
 * Example:
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
 * linkedList.get(1);            // returns 2
 * linkedList.deleteAtIndex(1);  // now the linked list is 1->3
 * linkedList.get(1);            // returns 3
 * <p>
 * Note:
 * All values will be in the range of [1, 1000].
 * The number of operations will be in the range of [1, 1000].
 * Please do not use the built-in LinkedList library.
 */
public class MyLinkedList {
    public ListNode head;
    public int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        size = 0;
        head = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size || index < 0) return -1;
        ListNode cur = head;
        while (index-- > 0) cur = cur.next; //all nodes in the linked list are 0-indexed
        return cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode temp = head;
        head = new ListNode(val);
        head.next = temp;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (head == null) {
            head = new ListNode(val);
        }
        ListNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new ListNode(val);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        else if (index <= 0) addAtHead(val);
        else {
            ListNode temp = head;
            while (index-- > 1) temp = temp.next;
            ListNode node = new ListNode(val);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size || size == 0 || index < 0) return;
        if (index == 0) { //delete head
            head = head.next;
        } else {
            ListNode temp = head;
            while (index-- > 1) temp = temp.next;
            temp.next = temp.next.next;
        }
        size--;
    }

    /**
     * Print MyLinkedList object
     */
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }

}
