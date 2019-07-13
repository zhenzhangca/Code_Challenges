package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() {
        ListNode inputHead = new ListNode(1);
        inputHead.next = new ListNode(2);
        inputHead.next = new ListNode(3);
        inputHead.next = new ListNode(4);
        inputHead.next = new ListNode(5);
        ListNode expectedHead = new ListNode(1);
        expectedHead.next = new ListNode(2);
        expectedHead.next = new ListNode(3);
        expectedHead.next = new ListNode(5);
        ListNode outputHead = RemoveNthNodeFromEndOfList.removeNthFromEnd(inputHead, 2);
        Assert.assertEquals(expectedHead, outputHead);
    }
}