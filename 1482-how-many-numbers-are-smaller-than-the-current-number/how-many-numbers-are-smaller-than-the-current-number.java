class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] c= new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int b=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j]){
                    b+=1;
                }
            }
            c[i]=b;
        }
        return c;
    }
}