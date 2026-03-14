class Solution {
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        reverse(nums, idx + 1, n - 1);

        int newj = -1;
        for (int j = idx + 1; j < n; j++) {
            if (nums[idx] < nums[j]) {
                newj = j;
                break;
            }
        }

        int temp = nums[idx];
        nums[idx] = nums[newj];
        nums[newj] = temp;
    }
}