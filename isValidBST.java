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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    private Boolean helper(TreeNode root, Integer lowest, Integer highest){
        if(root==null) return true;
        if(lowest!=null && root.val<=lowest) return false;
        if(highest!=null && root.val>=highest) return false;
        return helper(root.left, lowest, root.val) && helper(root.right, root.val, highest);
    }
}
