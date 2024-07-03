package day45;

public class day45 {
    public static class Node{
        Node[] childern;
        boolean eow;

        public Node(){
            childern = new Node[26]; //a to z
            for(int i = 0; i<26; i++){
                childern[i] = null;
            }
            eow = false;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i =0 ; i< word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.childern[idx] == null){
                curr.childern[idx] = new Node();
            }
            if(i == word.length()-1){                
                curr.childern[idx].eow = true;
            }
            curr =  curr.childern[idx];
        }
    }

    public static boolean search(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.childern[idx] == null){
                return false;
            }
            if(i == word.length() -1){
                if(curr.childern[idx].eow == false){
                    return false;
                }
            }
            curr = curr.childern[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i = 1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i, key.length());

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for(String str : words){
            insert(str);
        }
        
        System.out.println(wordBreak(key)); // true
        System.out.println(wordBreak("a")); // false
    }
}
