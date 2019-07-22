package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        linkedList.printList(linkedList.head);
        ListNode newHead = RemoveNthNodeFromEndOfList.removeNthFromEnd(linkedList.head, 2);
        linkedList.printList(newHead);
    }
}