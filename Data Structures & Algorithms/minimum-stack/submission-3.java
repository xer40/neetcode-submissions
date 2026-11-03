class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mins = new Stack<>();

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.empty()){
            this.mins.push(val);
        }
        else if(mins.peek()>=val){
            this.mins.push(val);
        }
        this.stack.push(val);
    }

    public void pop() {
        if(stack.peek()<=mins.peek()){
            this.mins.pop();
        }
        this.stack.pop();
        
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.mins.peek();
    }
}
