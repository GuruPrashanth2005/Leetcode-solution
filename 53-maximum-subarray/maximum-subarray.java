class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int csum = 0;
        if(n == 1)
        {
            return sum;
        }
        for(int i = 0; i < n; i++)
        {
            csum += nums[i] ;
            if(csum > sum)
            {
                sum = csum;
            }
            if(csum < 0)
            {
                csum = 0;
            }
        }
        return sum;

    }
}