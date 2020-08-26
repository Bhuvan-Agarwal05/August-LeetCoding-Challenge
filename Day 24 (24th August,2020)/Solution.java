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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 0;
        findLeftLeaves(root,0,0);
        return sum;
    }
    
    private void findLeftLeaves(TreeNode root,int l,int r)
    {
        if(root.left==null && root.right==null && l==1)
            sum += root.val;
        else 
        {
            if(root.left!=null)
                findLeftLeaves(root.left,1,0); // 1 because to mark that the node is a left node
            if(root.right!=null)
                findLeftLeaves(root.right,0,1);
        }
        return;
    }
}