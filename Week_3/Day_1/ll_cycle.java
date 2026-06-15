package Week_3.Day_1;

import java.util.HashSet;
import java.util.Set;

public class ll_cycle {

     class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
        next = null;
     }
 }
 
      public boolean hasCycle(ListNode head) {
        
        Set<ListNode> set =  new HashSet<>();

        ListNode ptr = head;

        while( ptr!=null){
            if(set.contains(ptr)){
                return true;
            }
            set.add(ptr);
            ptr = ptr.next;
        }
        return false;

    }
    
}
