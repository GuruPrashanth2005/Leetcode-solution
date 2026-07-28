class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        char[] half = s.substring(0, n / 2).toCharArray();
        Arrays.sort(half);

        String res =
            new String(half)
            + ((n & 1) == 1 ? s.charAt(n / 2) : "")
            + new StringBuilder(new String(half)).reverse();

        return res;
    }
}