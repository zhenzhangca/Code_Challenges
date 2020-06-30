package ca.jrvs.challenge.LinkedList;

/**
 * Reverse a linkedList
 * input:5->1->9->4->null
 * output:4->9->1->5->null
 */
public class ReverseIterative {
    public static ListNode reverseI(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev; //real reverse
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static void main(String[] args) {
//        5->1->9->4->null
        ListNode head = new ListNode(5);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        ListNode currI = head;
        while(currI != null){
            System.out.print(currI.value + "--");
            currI = currI.next;
        }
        System.out.println();
        System.out.println("--iterative--");
        ListNode currII = reverseI(head);
        while(currII!= null){
            System.out.print(currII.value + "--");
            currII = currII.next;
        }

    }
}
