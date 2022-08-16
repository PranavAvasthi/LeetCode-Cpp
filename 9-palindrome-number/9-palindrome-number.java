class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int real = x;
        
        while(x>0) {
            int rem = x%10;
            sum = sum*10 + rem;
            x = x/10;
        }
        
        if(sum == real) {
            return true;
        } else {
            return false;
        }
    }
}