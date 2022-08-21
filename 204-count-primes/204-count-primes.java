class Solution {
    public int countPrimes(int n) {
        if(n<=2) {
            return 0;
        }
        
        boolean[] comp = new boolean[n]; // true represents composite numbers.
        int limit = (int)Math.sqrt(n);
        
        for(int i=2; i<=limit; i++) {
            if(comp[i]==false) {
                for(int j=i*i; j<n;j+=i) {
                    comp[j]=true;
                }
            }
        }
        
        int cnt=0;
        for(int i=2; i<n; i++) {
            if(comp[i]==false) {
                cnt++;
            }
        }
        return cnt;
    }
}