class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0; i<=30; i++) {
            double ans = Math.pow(2,i);
            if(ans==n) {
                return true;
            }
        }
        return false;
    }
}