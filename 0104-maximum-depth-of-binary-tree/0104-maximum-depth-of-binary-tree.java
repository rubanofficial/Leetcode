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
    int res(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = res(root.left);
        int r = res(root.right);
        int max = Math.max(l,r)+1; 
        return max;
    }
    public int maxDepth(TreeNode root) {
        return res(root);
    }
}