package ca.jrvs.challenge.LinkedList;

/**
 * find mid node of LinkedList
 * 2->3->1->10->9->null
 * mid = 1
 * 2->3->1->10->null
 * mid = 3
 * High level idea: slow & fast pointers
 */
public class FindMid {
    public static ListNode findMid(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){ //make sure always return mid left when even
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(10);
        ListNode n4 = new ListNode(9);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        System.out.println(findMid(head).value); // 3
        n3.next = n4;
        System.out.println(findMid(head).value); //1
    }
}
