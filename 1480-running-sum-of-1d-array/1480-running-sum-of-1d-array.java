class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        
        // i=1 as 0th index is already assigned with the value of sum
        for(int i=1; i<n; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        
        return nums;
    }
}