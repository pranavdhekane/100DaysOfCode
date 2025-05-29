package contest;
import java.util.*;
public class abc {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    HashSet<Integer> set = new HashSet<>();

    public void traverse(int n, TreeNode root) {
        if (root == null) {
            set.add(n);
            return;
        } else {
            n++;
        }

        traverse(n, root.left);
        traverse(n, root.right);
    }

    public boolean isBalanced(TreeNode root) {
        if (set.size() > 2) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        
    }
}