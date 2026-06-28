class Solution {
    public int minElement(int[] nums) 
    {
        int min = Integer.MAX_VALUE;

        for(int n : nums)
        {
            int tot = 0;

            while(n > 0)
            {
                tot += n % 10;
                n /= 10;
            }

            min = Math.min(min, tot);

            if(min == 1)
            {
                return 1;
            }
        }

        return min;
    }
}