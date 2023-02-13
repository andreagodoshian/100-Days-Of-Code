package org.example;

/*
NEED TO KNOW:
-Palindrome checker
-Common prefix
-Valid Parenthesis
-Remove Array Element
-Roman -> int
*/

import java.util.Stack;

public class App
{
    public static void main( String[] args ) {
        System.out.println("Hej Världen!");

        System.out.println(isValid("{}[]()"));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}