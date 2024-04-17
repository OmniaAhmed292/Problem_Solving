//https://leetcode.com/problems/smallest-string-starting-from-leaf
 public String smallestFromLeaf(TreeNode root) {
        return dfs(root, "");
    }
    public String dfs(TreeNode root, String suffix){
        if(root == null){
            return suffix;
        }
        suffix = (char)('a' + root.val) + suffix;
        if(root.left == null && root.right == null){
            return suffix;
        }
        if(root.left == null){
            return dfs(root.right, suffix);
        }
        if(root.right == null){
            return dfs(root.left, suffix);
        }
        String left = dfs(root.left, suffix);
        String right = dfs(root.right, suffix);

        return left.compareTo(right) <= 0 ? left : right;
    }
