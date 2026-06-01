package Week_1.Day_1;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i =1;i<nums.length;i++){
            if(nums[j] != nums[i]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}
