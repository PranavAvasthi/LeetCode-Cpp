class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<n; i++) {
            // at index[i] put value of nums[i]
            li.add(index[i], nums[i]);
        }
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            // Put Value of particular index of list in ans
            ans[i] = li.get(i);
        }
        return ans;
    }
}