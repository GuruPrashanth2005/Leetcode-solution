class Solution {
    int f(int n, int [] dp) {
        if(n == 1 || n == 2) {
            return n;
        }
        if(dp[n] != -1) return dp[n];
        int one = f(n - 1, dp);
        int two = f(n -2, dp);

        dp[n] = one + two;
        return dp[n];
    }
    public int climbStairs(int n) {
        int [] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = f(n, dp);
        return ans;
    }
}