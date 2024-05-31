package day16;


public class day16 {
    public static void subsequences(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        subsequences(str, idx+1, newStr + currChar);

        subsequences(str, idx+1, newStr);
    }
        
    public static void main(String[] args) {
        subsequences("pra", 0, "");
    }   
}
