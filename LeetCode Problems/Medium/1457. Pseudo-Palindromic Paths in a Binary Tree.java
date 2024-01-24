//https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/description/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
        
int dfs(TreeNode root, int[] count) {
        if (root == null) return 0;
        count[root.val]++;
        //When reaching the leaf node, check if the path is pseudo-palindrome
        if (root.left == null && root.right == null) {
            int odd = 0;
            for (int i = 1; i <= 9; i++) {
                if (count[i] % 2 == 1) odd++;
            }
            count[root.val]--;
            if (odd > 1) return 0;
            else return 1;
        }
        int left = dfs(root.left, count);
        int right = dfs(root.right, count);
        count[root.val]--;
        return left + right;
    }

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] count = new int[10];
        return dfs(root, count);

    }
    
}
