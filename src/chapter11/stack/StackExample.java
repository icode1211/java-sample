package chapter11.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("coin1");
        stack.push("coin2");
        stack.push("coin3");
        stack.push("coin4");

        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); // 무한반복
        }
    }
}
