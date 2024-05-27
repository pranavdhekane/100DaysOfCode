package day12;
public class day12 {
    static String leftRotate(String str, int d){
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
    static String rightRotate(String str , int d){
        return leftRotate(str, str.length()-d);
    }
    public static void main(String[] args) {
        String str1 = "pranav";
        String str2 = str1;

        System.out.println(str1);
        System.out.println(leftRotate(str1, 2));
        System.out.println(rightRotate(str2, 2));
        
    }  
}
