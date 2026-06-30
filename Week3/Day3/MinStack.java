class MinStack {
    private Stack <Integer> mainstack;
    private Stack <Integer> minstack;
    
    public MinStack() {
       mainstack=new Stack<>();
       minstack=new Stack<>();
    }
    
    public void push(int value) {
        mainstack.push(value);

        if(minstack.isEmpty())
        {
            minstack.push(value);
        }
        else
        {
            minstack.push(Math.min(value,minstack.peek()));
        }
    }
    
    public void pop() {
        mainstack.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return mainstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
