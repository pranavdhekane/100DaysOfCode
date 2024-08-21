public class day94 {
    public static int strStr(String haystack, String needle) {
        int n = 0;
        int idx = -1;
        for(int i = 0; i<haystack.length(); i++){
            if(needle.charAt(n) == haystack.charAt(i)){
                if(idx == -1){
                    idx = i;
                }
                n++;
                if(n == needle.length()){
                    return idx;
                }
            } else {
                i = i -n;
                idx = -1;
                n = 0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        String haystack = "mississippi", needle = "issip";
        
        // String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}
