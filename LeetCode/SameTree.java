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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Checking if both the node are null
        if(p == null && q == null){
            return true;
        }
        //checking if either node is null
        else if(p == null || q == null){
            return false;
        }
        //Checking if value is different
        else if(p.val != q.val){
            return false;
        }
        else{
            //Calling recursively for the right node and left node
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
    }
}