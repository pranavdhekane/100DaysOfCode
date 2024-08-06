package day78;

import java.util.HashMap;

public class day78 {
    public static int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;

        for(int i = s.length() -1 ; i >= 0; i--) {
            char ch = s.charAt(i);
            if(i == 0){
                num += map.get(ch);
                break;
            }
            if(map.get(ch) > map.get(s.charAt(i-1))){
                num += map.get(ch) - map.get(s.charAt(i-1));
                i--;
            } 
            else {
                num += map.get(ch);
            }
        }

        return num;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
