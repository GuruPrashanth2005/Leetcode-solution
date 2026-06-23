class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left_max = 0, right_max = 0;
        int [] left = new int[n];
        int [] right = new int[n];
        int res = 0;
        for(int i = 0; i < n; i++){
            if(left_max <= height[i]){
                left_max = height[i];
            }
            if(right_max <= height[n - i - 1]){
                right_max = height[n - i - 1];
            }
            left[i] = left_max;
            right[n - i - 1] = right_max;
        }
        int [] water = new int[n];
        for(int i = 0; i < n; i++){
            water[i] = Math.min(right[i], left[i]);
            res += water[i] - height[i];
        }
        return res;
    }
}