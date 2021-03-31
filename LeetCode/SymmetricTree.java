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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode right, TreeNode left){
         if(right == null && left == null){
                    return true;
                }
        if(right == null || left == null){
            return false;
        }
    //right sub tree left child must be equal to left sub tree right child
     return (right.val == left.val) && isMirror(right.left, left.right) && isMirror(right.right, left.left);
            }
}