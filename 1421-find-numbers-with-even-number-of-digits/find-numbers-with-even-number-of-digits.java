class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=0;
            while(a>0){
                b+=1;
                a/=10;
            }

            if(b%2==0){
                c+=1;
            }
        }
        return c;
    }
}