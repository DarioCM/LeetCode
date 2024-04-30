package org.example.stack;

import java.util.Stack;

public class ValidParentheses_20 {

    public boolean isValid(String s) {

        Stack<Character> stackCh = new Stack<>();

        for (var c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stackCh.push(c); // added to yhe stack
            } else if (c == ')' && !stackCh.isEmpty() && stackCh.peek() == '(') {
                stackCh.pop();
            } else if (c == '}' && !stackCh.isEmpty() && stackCh.peek() == '{') {
                stackCh.pop();
            } else if (c == ']' && !stackCh.isEmpty() && stackCh.peek() == '[') {
                stackCh.pop();
            } else {
                return false;
            }
        }
        return stackCh.isEmpty();
    }

}
