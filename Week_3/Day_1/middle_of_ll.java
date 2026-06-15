package Week_3.Day_1;

import Week_3.Day_1.ll_cycle.ListNode;

public class middle_of_ll {
    
     public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while( fast!= null && fast.next!= null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
