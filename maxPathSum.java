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
    int max= Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root);
        return max;
    }
    int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int lN= Math.max(0, dfs(root.left));
        int rN= Math.max(0, dfs(root.right));
        max= Math.max(max, lN+rN+ root.val);
        return Math.max(lN, rN)+ root.val;
    }
}
