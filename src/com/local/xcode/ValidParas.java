package com.local.xcode;

import java.util.Stack;

public class ValidParas {
    public static void main(String... args) {
        String s = "[{()}]";
        System.out.println("Stack is empty " +check(s));
    }

    public static boolean check(String s ) {
        Stack<Character> stk = new Stack<>();
        for (Character ch : s.toCharArray())
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.isEmpty())
                    return false;
                char top = stk.pop();
                if( (ch == ')' && top !='(') || (ch == ']' && top !='[') || (ch == '}' && top !='{') ) {
                    return false;
                }
            }
        return stk.isEmpty();
    }
}