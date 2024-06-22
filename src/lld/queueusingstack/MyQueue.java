package lld.queueusingstack;

import java.util.Stack;

public class MyQueue<T> {

    private final Stack<T> stack1; // always contains elements inserted into queue in reverse order. element inserted first will be at top
    private final Stack<T> stack2; // temporary stack being used for insert operation

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Adds the element to end
     * */
    public void enQueue(T t) {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        stack1.add(t);
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
    }

    /**
     * Deletes the element which was inserted first
     * */
    public T deQueue() {
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
