class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int val:nums){
            if(val<min)min=val;
            if(val>max)max=val;
        }
        return (min+k)>(max-k)?0:(max-k)-(min+k);
    }
}