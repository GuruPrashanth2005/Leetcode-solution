class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] nge = new int [n];
        Arrays.fill(nge, - 1);
        Stack<Integer> st = new Stack <>();
        for(int i = 2*n-1; i >= 0; i--)
        {
            int curr = nums[i%n];
            while(!st.isEmpty() && st.peek() <= curr)
            {
                st.pop();
            }
            if(i <= n - 1)
            {
                if(!st.isEmpty()) nge[i] = st.peek();
            }
            st.push(curr);
        }
        return nge;
    }
}