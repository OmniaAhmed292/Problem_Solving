//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
 public int sumNumbers(TreeNode root) {
        return TracksumNumber(root, 0);
    }
    public int TracksumNumber(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return TracksumNumber(root.left, sum) + TracksumNumber(root.right, sum);
    }
