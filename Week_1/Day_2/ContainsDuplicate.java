package Week_1.Day_2;

import java.util.HashSet;

public class ContainsDuplicate {
     public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) {
            if(seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    
}
