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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> res =new  ArrayList<>();
        if(root == null) return res;
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            level++;
            int s = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<s;i++){   
                TreeNode node = q.poll();
                if(node.left!= null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                a.add(node.val);
            }
            if(level%2 == 0){
                Collections.reverse(a);
            }
            res.add(a);
        }
        return res;
    }
}