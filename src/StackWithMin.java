import java.util.Stack;

public class StackWithMin {
    private Stack<Integer> minStack = new Stack<>();
    //在使用一个对象的时候，要先对其初始化，要不然就空指针异常了。
    private Stack<Integer> stack = new Stack<>();
    public void push(int node) {
        if (minStack.isEmpty()) {
            minStack.push(node);
            stack.push(node);
            return;
        }

        if (node < minStack.peek()) {
            minStack.push(node);
            stack.push(node);
        }
        else {
            minStack.push(minStack.peek());
            stack.push(node);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty())
            return stack.peek();
        else return -1;
    }

    public int min() {
        return minStack.peek();
    }
}
