package day34;

import java.util.ArrayList;

public class day34 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        
        if(root.data < val){
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <=y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if(root.data >= y){
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);

        if(root.left == null && root.right == null){
            System.out.println(list);
        } else {
            rootToLeaf(root.left, list);
            rootToLeaf(root.right, list);
        }

        list.remove(list.size()-1);
    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14};
        Node root = null;
       
        for(int i =0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        // printInRange(root, 3, 6);
        ArrayList<Integer> list = new ArrayList<>();
        rootToLeaf(root, list);
    }    
}
