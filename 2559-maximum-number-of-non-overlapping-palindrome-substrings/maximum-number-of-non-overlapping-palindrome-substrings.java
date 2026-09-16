class Solution {
    private boolean isPalindrome(String s,int i,int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--))return false;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int res = 0;
        int left = 0;
        int right = left + k - 1;
        int n = s.length();
        while(right < n){
            if(isPalindrome(s,left,right)){
                ++res;
                left += k;
                right = left + k - 1;
            }else if(right + 1 < n && isPalindrome(s,left,right+1)){
                ++res;
                left += k+1;
                right = left + k - 1;
            }else{
                ++left;
                ++right;
            }
        }
        return res;
    }

}