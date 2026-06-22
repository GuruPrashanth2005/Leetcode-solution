class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        int count = 0, one = 0;
        for(int a : mp.values()){
            count += ((a / 2) * 2);
            if(a % 2 == 1) one = 1;
        }
        return count + one;
    }
}