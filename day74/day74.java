package day74;

public class day74 {
    public static void main(String[] args) {
        String s = "0P";

        int n = s.length();

        StringBuilder str = new StringBuilder();
        for(int i = 0; i< n; i++) {
            char ch = s.charAt(i);

            if(ch >= 65 && ch <= 90){
                ch += 32;
                str.append(ch);
            } 
            else if(ch >= 97 && ch <= 122) str.append(ch);
        }

        System.out.println(str);
    }
}
