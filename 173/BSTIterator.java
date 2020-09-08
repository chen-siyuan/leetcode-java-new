import java.util.*;

public class BSTIterator {

    public List<Integer> res;

    public BSTIterator(TreeNode root) {
        res = new ArrayList<>();
        search(root);
    }

    public void search(TreeNode node) {
        if(node == null) return;
        search(node.left);
        res.add(node.val);
        search(node.right);
    }

    public int next() {
        return res.remove(0);
    }

    public boolean hasNext() {
        return !res.isEmpty();
    }

}
