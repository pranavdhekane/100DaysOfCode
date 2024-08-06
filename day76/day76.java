package day76;

public class day76 {
    public static int myAtoi(String s){
        s =  s.trim();

        if(s.isEmpty()) return 0;

        boolean isNegative = false;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(0) == '-'){
                isNegative = true;
            } else {
                isNegative = false;
            }
        }

        // boolean zero = false;
        StringBuilder num = new StringBuilder("");
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if((isNegative || ch == '+') && i == 0){
                continue;
            } else if(ch >= '0' && ch <= '9'){
                num.append(ch);
            } else if(ch == ' '){
                 
            } else{
                break;
            }
        }

        if(num.isEmpty()) return 0;
        if(num.length() > 9) {
            if(isNegative) return -2147483648;
            else return 2147483647;
        }
        int n = Integer.parseInt(num.toString());
        
        if(isNegative) return -n;
        return n;

    }

    public static int reverse(int x) {
        long n = 0;

        while(x >= 0){
            int l = x%10;
            n = n * 10 + l;
            x/=10;
        }

        if(n > 2147483647  || n < -2147483648){
            return 0;
        }

        return (int)n;
    }

    public static double myPow(double x, int n) {
        double num = 1;
        
        for(int i = 0; i < ((n<0)? -n :n) ; i++){
            num *= x;
        }
        if(n < 0){
            return 1 / num;
        } else if(n == 0){
            return (double)1;
        } else {
            return num;
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow((double) 2, -2));
    }
}