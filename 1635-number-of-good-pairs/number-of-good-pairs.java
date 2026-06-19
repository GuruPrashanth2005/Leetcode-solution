class Solution {
    public int numIdenticalPairs(int[] nums) {
       int cnt = 0;
       int n = nums.length;
       HashMap<Integer, Integer> mp = new HashMap<>();
       for(int i = 0; i < n; i++)
       {
            int curr = nums[i];
            if(mp.containsKey(curr)){
                cnt += mp.get(curr);
            }
            mp.put(curr, mp.getOrDefault(curr,0)+1);
       }
       return cnt;
    }
}