class Solution {
    public void moveZeroes(int[] nums) {
    int count = 0;
    List<Integer> res = new ArrayList<>();
       for(int i=0; i<nums.length;i++){
        if(nums[i]!=0){
          res.add(nums[i]);
        }else{
            count++;
        }
      } 
      for(int  i= 0; i<count;i++){
        res.add(0);
      }
      for(int  i =0; i<nums.length;i++){
        nums[i]= res.get(i);
      }
    }
}