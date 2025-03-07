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
    List<Integer> res= new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightSide(root, 0);
        return res;
    }
    void rightSide(TreeNode root, int d){
        if(root==null){
            return ;
        }
        if(d==res.size()){
            res.add(root.val);
        }
        rightSide(root.right, d+1);
        rightSide(root.left, d+1);
    }
}
