class MyQueue {

    Stack<Integer> data;
    Stack<Integer> temp;

    public MyQueue() {
        this.data = new Stack<>();
        this.temp = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
    }
    
    public int pop() {

        /* Take out all elemen to temp */
        while(!data.isEmpty()) {
            temp.push(data.pop());
        }
        int itemToPop = temp.pop();
        
        /* Push all remaining item to data */
        while(!temp.isEmpty()) {
            data.push(temp.pop());
        }
        
        return itemToPop;
    }
    
    public int peek() {
        /* Take out all elemen to temp */
        while(!data.isEmpty()) {
            temp.push(data.pop());
        }
        int itemToPeek = temp.peek();
        
        /* Push all remaining item to data */
        while(!temp.isEmpty()) {
            data.push(temp.pop());
        }

        return itemToPeek;
    }
    
    public boolean empty() {
        return data.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */