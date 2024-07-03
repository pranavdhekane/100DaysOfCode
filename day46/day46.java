package day46;

public class day46 {
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

    //insertion in trie
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

    //Searching in trie
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

    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i = 0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            
            if(curr.childern[idx] == null){
                return false;
            }

            curr = curr.childern[idx];

        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(String word : words){
            insert(word);
        }
        System.out.println(startsWith("appl"));
    }
}
