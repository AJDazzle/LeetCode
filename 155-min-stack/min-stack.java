class MinStack {
    Stack<Integer>a;
    Stack<Integer>min;
    public MinStack() {
        a=new Stack<>();
        min=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        a.push(val);
        if(val<=min.peek())
        {
            min.push(val);
        }
    }
    
    public void pop() {
        int temp=a.pop();
        if(min.peek()==temp)
        {
            min.pop();
        }
    }
    
    public int top() {
       return a.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */