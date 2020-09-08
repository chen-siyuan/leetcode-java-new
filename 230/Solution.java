import java.util.*;

public class Solution {

    public static Queue<Integer> queue;

    public int kthSmallest(TreeNode root, int k) {

        queue = new LinkedList<>();

        search(root);

        for(int i=0; i < k - 1; i++) queue.poll();

        return queue.poll();
    }

    public static void search(TreeNode node) {
        if(node == null) return;
        search(node.left);
        queue.add(node.val);
        search(node.right);
    }

}
