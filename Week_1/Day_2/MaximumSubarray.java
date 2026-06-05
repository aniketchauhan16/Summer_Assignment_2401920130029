package Week_1.Day_2;

public class MaximumSubarray {
     public static int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];
        for(int i =1;i<nums.length;i++) { 
            cs = Math.max(nums[i] ,cs + nums[i] );
            ms = Math.max(cs, ms);
        }
        return ms;
        
    }
    public static void main(String[] args) {
        int nums[] = {};
        System.out.println(maxSubArray(nums));

    }
    
}
