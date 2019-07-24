package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLinkedListTest {

    @Test
    public void getLength() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        int length1 = LengthOfLinkedList.getLength(myLinkedList.head);
        assertEquals(4, length1);
        myLinkedList.addAtTail(5);
        int length2 = LengthOfLinkedList.getLength(myLinkedList.head);
        assertEquals(5, length2);
    }
}