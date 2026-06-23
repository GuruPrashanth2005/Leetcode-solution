class Solution {
    public int maxArea(int[] height) {
        int maxi = 0;
        int n = height.length;
        int l = 0, r = n - 1;
        while(l <= r){
                int len = Math.min(height[l], height[r]);
                int b = r - l;
                int area = len * b;
                if(area > maxi) maxi = area;
                if(height[l] <= height[r]) l++;
                else r--;
        }
        return maxi;
    }
}