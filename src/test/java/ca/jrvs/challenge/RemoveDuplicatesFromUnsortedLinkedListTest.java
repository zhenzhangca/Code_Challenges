package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromUnsortedLinkedListTest {

    @Test
    public void removeDuplicate() {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addAtHead(12);
        myLinkedList1.addAtTail(11);
        myLinkedList1.addAtTail(12);
        myLinkedList1.addAtTail(21);
        myLinkedList1.addAtTail(41);
        myLinkedList1.addAtTail(43);
        myLinkedList1.addAtTail(21);
        myLinkedList1.printList(myLinkedList1.head);
        ListNode newHead1 = RemoveDuplicatesFromUnsortedLinkedList.removeDuplicate(myLinkedList1.head);
        myLinkedList1.printList(newHead1);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addAtHead(10);
        myLinkedList2.addAtTail(12);
        myLinkedList2.addAtTail(11);
        myLinkedList2.addAtTail(11);
        myLinkedList2.addAtTail(12);
        myLinkedList2.addAtTail(11);
        myLinkedList2.addAtTail(10);
        myLinkedList2.printList(myLinkedList2.head);
        ListNode newHead2 = RemoveDuplicatesFromUnsortedLinkedList.removeDuplicate(myLinkedList2.head);
        myLinkedList2.printList(newHead2);
    }
}