class Solution {
    public int f(int[] nums, int k) {
        if (k < 0) return 0;

        int n = nums.length;
        int l = 0, cnt = 0, sum = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum > k) {
                sum -= nums[l];
                l++;
            }

            cnt += (r - l + 1);
        }

        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return f(nums, goal) - f(nums, goal - 1);
    }
}