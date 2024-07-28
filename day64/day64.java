package day64;

import java.util.Stack;

public class day64 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
                System.out.println(ch + " " + i);
            } else {
                if (ch == '}') {
                    System.out.println(1);
                    if (st.pop() != '{')
                    return false;
                }
                else if (ch == '(') {
                    System.out.println(2);
                    if (st.pop() != ')')
                    return false;
                }
                else if (ch == ']') {
                    System.out.println(3);
                    if (st.pop() != ']')
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}
