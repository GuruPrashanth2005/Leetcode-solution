class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int [] freq= new int[1000];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int middle=nums.length/2;
        return freq[nums[middle]]==1;
    }
}