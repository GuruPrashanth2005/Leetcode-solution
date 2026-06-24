class Solution {

    int f(int[] nums, int k) {
        if (k < 0) return 0;

        int l = 0, cnt = 0, odd = 0;
        int n = nums.length;

        for (int r = 0; r < n; r++) {
            if (nums[r] % 2 == 1) odd++;

            while (odd > k) {
                if (nums[l] % 2 == 1) odd--;
                l++;
            }

            cnt += (r - l + 1);
        }

        return cnt;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return f(nums, k) - f(nums, k - 1);
    }
}