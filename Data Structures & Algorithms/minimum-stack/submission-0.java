class MinStack {

     Deque<Integer> stack;
    Deque<Integer> minStack;

    static void main() {

    }

    public MinStack() {
       stack = new ArrayDeque<Integer>();
       minStack = new ArrayDeque<Integer>();
    }

    public void push(int val) {
        stack.push(val);
        int newMin = minStack.isEmpty() ? val:Math.min(val,minStack.peek());
        minStack.push(newMin);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
       return stack.peek();
    }

    public int getMin() {
       return minStack.peek();
    }
}
