import java.util.*;

public class Solution {

    public static Node helper(Node node) {
    
        Node temp = node.next;

        while(temp != null) {
            if(temp.left != null) return temp.left;
            if(temp.right != null) return temp.right;
            temp = temp.next;
        }

        return null;
    }

    public Node connect(Node root) {

        if(root == null || (root.left == null && root.right == null)) return root;

        if(root.right == null) {
            root.left.next = helper(root);
        } else {
            if(root.left != null) root.left.next = root.right;
            root.right.next = helper(root);
        }

        connect(root.right);
        connect(root.left);
        
        return root;
    }

}
