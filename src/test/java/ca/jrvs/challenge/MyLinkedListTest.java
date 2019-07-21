package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testMyLinkedList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        printList(myLinkedList);
        assertEquals(2,myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        printList(myLinkedList);
        assertEquals(3,myLinkedList.get(1));

    }

    private void printList(MyLinkedList myLinkedList){
        ListNode curr = myLinkedList.dummy.next;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println();
    }


}