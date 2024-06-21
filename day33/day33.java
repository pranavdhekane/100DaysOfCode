package day33;

public class day33 {
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
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data < key){
            return search(root.right, key);
        }
        return false;
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        } else if(root.data < val){
            root.right = delete(root.right, val);
        } else {//root.data == val

            //case 1 : root node has no childnodes
            if(root.right == null && root.left == null){
                return null;
            }

            //case 2 : root node has one childNode
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            //case 3 : root has Both childnodes
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }
    public static Node inorderSuccessor(Node root){
        while(root.left!= null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
       
        for(int i =0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        delete(root, 5);
        inorder(root);  
        System.out.println();     
    }
}
