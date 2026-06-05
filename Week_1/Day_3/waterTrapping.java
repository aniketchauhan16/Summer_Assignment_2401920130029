package Week_1.Day_3;

public class waterTrapping { 
     public static int maxArea(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = n - 1;
        int max = Integer.MIN_VALUE;

      
        while (i < j) {
            int water = (j - i) * Math.min(nums[i], nums[j]);

            max = Math.max(max, water);
            if (nums[i] < nums[j]) i++;
               else j--;
        }

        return max;
    
}}
