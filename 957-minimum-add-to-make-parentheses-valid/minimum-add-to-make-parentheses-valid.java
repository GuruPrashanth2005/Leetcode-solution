class Solution {
    public int minAddToMakeValid(String s) {
        int opened = 0, added = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') opened++;
            else if (opened > 0) opened--;  // close a pending "("
            else added++;  // ")" with nothing to close -> add a "("
        }
        return added + opened;  // still-open "(" need a ")" each
    }
}