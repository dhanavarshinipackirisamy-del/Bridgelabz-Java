package stackqueuehash.stackqueue;

import java.util.Stack;

class sortStack {

    static void sortedInsert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, x);
        stack.push(temp);
    }

    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sortStack(stack);
            sortedInsert(stack, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        sortStack(stack);

        System.out.println(stack);
    }
}
