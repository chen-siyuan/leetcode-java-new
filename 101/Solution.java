import java.util.*;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode p, TreeNode q) {
    
        if(p == null) {
            return q == null;
        } else {
            if(q == null) return false;
            return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
        }

    }

}
