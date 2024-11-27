package interview;

import java.util.Stack;

public class LRU {
    static  Stack<Integer> stack = new Stack<>();
    static {
        stack.push(01);
        stack.push(12);
        stack.push(23);
        stack.push(34);
    }

    public static void main(String[] args) {
        pushElement(45);
        System.out.println(getRecent());
    }

    public static void pushElement(int ele) {
        stack.push(ele);
    }

    public static int getRecent() {
        return stack.pop();
    }

}