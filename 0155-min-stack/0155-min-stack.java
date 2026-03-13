class MinStack {
    Stack  <Integer> res;
    Stack <Integer> min;
    public MinStack() {
        res = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        res.push(val);
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        int e = res.pop();
        if(e == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return res.peek();
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