class MinStack {

    /* 
        Bruteforce Approach:
        Keep the value and min at that point as a Pair 
        [value, minAtThatPoint] 
        Time Complexity - O(1)
        Space Complexity - O(2n)
    */

    Stack<int[]> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        
        if(stack.isEmpty()) {
            stack.push(new int[] {val, val});
        } else {
            int curMin = stack.peek()[1];
            int newMin = Math.min(curMin, val);
            stack.push(new int[] {val, newMin});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}
