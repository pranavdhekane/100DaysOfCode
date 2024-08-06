package day80;

public class day80{
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs.length == 1) return new String();
        StringBuilder str = new StringBuilder();
        int p = 0;

        while(true) {
            char ch = strs[0].charAt(p);
            for(int i = 0; i<strs.length; i++) {
                if(p == strs[i].length())
                    return str.toString();
                if(strs[i].charAt(p) != ch)
                    return str.toString();
            }
            str.append(ch);
            p++;
        }
    }
    public static void main(String[] args) {
        String[] strs = {""};

        System.out.println(longestCommonPrefix(strs));
    }
}