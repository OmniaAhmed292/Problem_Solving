//https://leetcode.com/problems/evaluate-boolean-binary-tree

public boolean evaluateTree(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) {
            return root.val == 1;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        if(root.val == 3) {
            return left && right;
        }
        if(root.val == 2) {
            return left || right;
        }
        if(left && right && root.val == 1) {
            return true;
        }
        return false;
    } 
