package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);  //addAtHead~
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        linkedList.printList(linkedList.head);
        ListNode newHead = ReverseLinkedList.reverseList(linkedList.head);
        linkedList.printList(newHead);
    }

}