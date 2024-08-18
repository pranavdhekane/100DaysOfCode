package day89;

import java.util.HashMap;

public class day89 {
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        char ch;
        for(int i = 0; i<text.length(); i++){
            ch = text.charAt(i);
            if(ch == 'b' || ch == 'a' || ch =='l' || ch == 'o' || ch == 'n') {
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                }
                else 
                    map.put(ch, 1);
            }
        }

        if(map.size() != 5) return 0;

        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);


        int count = Integer.MAX_VALUE;
        for(int i : map.values()){
            System.out.println(i);
            if(count > i) count = i;
        }

        return count;
    }

    public static void main(String[] args) {
        int i  = maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw");
        System.out.println(i);
        
    }
}
