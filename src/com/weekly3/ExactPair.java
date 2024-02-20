package com.weekly3;

import java.util.Stack;

/**
 * 올바른 괄호 짝인지 결과 리턴
 * ((())()) -> true
 * (()()))( -> false
 * ((()) -> false
 */
public class ExactPair {
    public static void main(String[] args) {
        System.out.println(isExactBracket("((())())"));  // true
        System.out.println(isExactBracket("(()()))("));  // false
        System.out.println(isExactBracket("((())"));  // false
        System.out.println(isExactBracket("))"));  // false
    }

    static boolean isExactBracket(String bracket) {
        Stack<Character> stack = new Stack<>();

        for (char ch : bracket.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
