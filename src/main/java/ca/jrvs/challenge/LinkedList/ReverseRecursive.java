package ca.jrvs.challenge.LinkedList;

public class ReverseRecursive {
    public static ListNode reverse(ListNode head){
        //corner case
        if(head == null){
            return null;
        }
        //base case
        if(head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        //5->1->9->4->null
        ListNode head = new ListNode(5);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        ListNode newHead = reverse(head);
        ListNode curr = newHead;
        while(curr != null){
            System.out.print(curr.value + "--");
            curr = curr.next;
        }
    }
}
