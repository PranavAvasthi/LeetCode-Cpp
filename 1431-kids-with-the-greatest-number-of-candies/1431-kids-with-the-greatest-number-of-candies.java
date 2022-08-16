class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        // int[] result = new int[n];
        int mxm = Integer.MIN_VALUE;
        ArrayList <Boolean> result = new ArrayList<>(n);
        
        for(int i=0; i<n; i++) {
            if(candies[i] > mxm) {
                mxm = candies[i];
            }
        }
        
        for(int i=0; i<n; i++) {
            if(candies[i] + extraCandies >= mxm) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}