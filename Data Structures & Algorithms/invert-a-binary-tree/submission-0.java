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
    public TreeNode invertTree(TreeNode root) {
        if(root==null||root.left==null&&root.right==null){
            return root;
        }
        swapper(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;        
    }

    private void swapper(TreeNode node){
        if(node.left==null&&node.right==null){
            return;
        }
        else if(node.left==null){
            node.left = node.right;
            node.right = null;
            return;
        }
        else if(node.right==null){
            node.right = node.left;
            node.left = null;
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
