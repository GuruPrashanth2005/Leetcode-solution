class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> subarrayCount = new HashMap<>();
        
        // Process all subarrays of size k
        for (int i = 0; i <= n - k; i++) {
            Set<Integer> uniqueNums = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                uniqueNums.add(nums[j]);
            }
            for (int num : uniqueNums) {
                subarrayCount.put(num, subarrayCount.getOrDefault(num, 0) + 1);
            }
        }
        
        // Find the largest integer that appears in exactly one subarray
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : subarrayCount.entrySet()) {
            if (entry.getValue() == 1 && entry.getKey() > ans) {
                ans = entry.getKey();
            }
        }
        
        return ans;
    }
}