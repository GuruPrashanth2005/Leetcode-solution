class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        int [] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int curr = i;
            while(!st.isEmpty() && nums[st.peek()]>=nums[curr]){
                st.pop();
            }
            if(!st.isEmpty()) pse[i] = st.peek()+1;
            st.push(curr);
        }
        //find the nse array 
        int [] nse = new int[n];
        Arrays.fill(nse , n);
        st.clear(); 
        for(int i=n-1 ; i>=0 ;i--){
            int curr = i;
            while(!st.isEmpty() && nums[st.peek()]>=nums[curr]){
                st.pop();
            }
            if(!st.isEmpty()) nse[i] = st.peek();
            st.push(curr);
        }
        int maxi = 0;
        for(int i=0 ; i<n;i++){
            int l = nums[i];
            int b = nse[i] - pse[i];
            int area = l*b;
            if(area>maxi) maxi = area;
        }
        return maxi;
    }
}