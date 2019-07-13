package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ListNode inputHead = new ListNode(1);
        inputHead.next = new ListNode(2);
        inputHead.next = new ListNode(3);
        inputHead.next = new ListNode(4);
        inputHead.next = new ListNode(5);
        ListNode expectedHead = new ListNode(5);
        expectedHead.next = new ListNode(4);
        expectedHead.next = new ListNode(2);
        expectedHead.next = new ListNode(2);
        expectedHead.next = new ListNode(1);

        ListNode outputHead = ReverseLinkedList.reverseList(inputHead);
        Assert.assertEquals(expectedHead, outputHead);
    }
}