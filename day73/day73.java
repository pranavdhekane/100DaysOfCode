package day73;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class day73 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public TreeNode buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;            
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode newNode = q.remove();
            List<Integer> l = new ArrayList<>();

            if(newNode.left == null && newNode.right == null) continue;

            if(newNode.left != null) {
                q.add(newNode.left);
                l.add(newNode.left.val);
            }

            if(newNode.right != null) {
                q.add(newNode.right);
                l.add(newNode.right.val);
            }

            list.add(l);
        }

        return list;
    }
    public static void main(String[] args) {
        int nodes[] = {3, 9, 20, -1, -1, 15, 7};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);

        List<List<Integer>> m = levelOrder(root);
        System.out.println(m);
    }
}
