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
    int height(TreeNode curr){
        if(curr == null){
            return 0;
        }
        int l = height(curr.left)+1;
        int r = height(curr.right)+1;
        int h = Math.max(l,r);
        return h;
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}