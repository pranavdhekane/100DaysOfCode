package day95;

import java.util.Stack;

public class day95 {
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<operations.length; i++){
            switch (operations[i]) {
                case "C":{
                    st.pop();
                    break;
                }

                case "D" : {
                    st.push(st.peek() * 2);
                    break;
                }
            
                case "+": {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b);
                    st.push(a);
                    st.push(a+b);
                    break;
                }
                default: {
                    st.push(Integer.valueOf(operations[i]));
                    break;
                }
            }
        }
        int sum = 0;
        while(st.isEmpty() == false){
            sum += st.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        // String []ops = {"5","2","C","D","+"};
        String [] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
        StringBuilder str = new StringBuilder("abc");
        str.insert(0, 'a');
        System.out.println(str);
    }
}
