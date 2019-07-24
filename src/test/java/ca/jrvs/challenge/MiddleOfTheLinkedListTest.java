package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfTheLinkedListTest {

    @Test
    public void middleNode() {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1); // addAtHead ~
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        linkedList.printList(linkedList.head);
        ListNode result1 = MiddleOfTheLinkedList.middleNode(linkedList.head);
        assertEquals(3, result1.val);
        linkedList.addAtTail(6);
        linkedList.printList(linkedList.head);
        ListNode result2 = MiddleOfTheLinkedList.middleNode(linkedList.head);
        assertEquals(4, result2.val);
    }
}