class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
        int[] ans = new int[n];
        
        Arrays.fill(ans , -1);
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i <= 2 * n - 1 ; i++)
        {
    while(st.size() != 0 && nums[st.peek()] <nums[i % n])
            {
                ans[st.pop()] = nums[i % n];
            }
            
            if(i < n)
            {
                st.push(i);
            }
        }
        
        return ans;
    }
}
