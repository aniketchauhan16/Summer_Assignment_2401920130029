package Week_1.Day_2;

public class MaximumAvgSubarray { public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
       for(int i = 0; i < k; i ++) 
           sum += nums[i];

       int n =nums.length;
       int maxAvgSum = sum;
       for(int i = k; i < n; i ++) {
           sum += nums[i] - nums[i - k];
           maxAvgSum = Math.max(maxAvgSum,sum);
       }
       return (double)maxAvgSum / k;
    }
    
}
