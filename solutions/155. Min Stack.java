class MinStack {
  Stack<Integer> st = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
      
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int max = Integer.MAX_VALUE;
        for(Integer s : st){
             if(s<max){
                 max=s;
             }
        }
        return max;
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
