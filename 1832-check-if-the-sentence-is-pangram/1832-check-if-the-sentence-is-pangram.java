class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean flag = true;
        for(char c='a'; c<='z'; c++) {
            flag = check(sentence, c);
            if(!flag) {
                return false;
            }
        }
        return true;
    }
    
    boolean check(String sentence, char c) {
        for(char ch : sentence.toCharArray()) {
            if(ch == c) {
                return true;
            }
        }
        return false;
    }
}