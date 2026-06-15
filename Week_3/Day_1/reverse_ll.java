package Week_3.Day_1;

import Week_3.Day_1.ll_cycle.ListNode;

public class reverse_ll {
    
     public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        return head;

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
