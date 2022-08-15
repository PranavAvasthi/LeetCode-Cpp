class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int k=0;
        
        for(int i=0; i<n; i++) {
            // for x co-ordinate
            ans[2*i] = nums[i];
            
            // for y co-ordinate 
            ans[k+1] = nums[i+n];
            
            k+=2;
        }
        return ans;
    }
}