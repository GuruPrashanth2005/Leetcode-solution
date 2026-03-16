class Solution {
    public int smallestEqual(int[] nums) {
        List<Integer> a= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                a.add(i);
            }
        }
        int min=Integer.MAX_VALUE;

        for(int i=0;i<a.size();i++){
           if(a.get(i)<min){
            min=a.get(i);
           }
        }

        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}