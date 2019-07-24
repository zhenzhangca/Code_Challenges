package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testMyLinkedList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.printList(myLinkedList.head);
        myLinkedList.addAtIndex(1, 2);
        myLinkedList.printList(myLinkedList.head);
        assertEquals(2, myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        myLinkedList.printList(myLinkedList.head);
        assertEquals(3, myLinkedList.get(1));
    }
}