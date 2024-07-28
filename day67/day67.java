package day67;

import java.util.Stack;

public class day67 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int n = 0; n < tokens.length; n++) {
            String ch = tokens[n];
            
            if(ch == "+" || ch == "-" || ch == "*" || ch == "/") {
                int num2 = st.pop();
                int num1 = st.pop();
                if (ch == "+") {
                    st.push(num1 + num2);
                } else if (ch == "-") {
                    st.push(num1 - num2);
                } else if (ch == "*") {
                    st.push(num1 * num2);
                } else {
                    st.push(num1 / num2);
                }
            } else {
                try {
                    int num = Integer.valueOf(ch);
                    st.push(num);
                } catch (NumberFormatException e) {
                    
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        // String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}