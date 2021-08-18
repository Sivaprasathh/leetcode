class MyStack {
Stack<Integer> st = new Stack<>();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        st.push(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return st.pop();
    }
    
    /** Get the top element. */
    public int top() {
        return st.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return st.isEmpty() ? true :false;
    }
}
​
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
