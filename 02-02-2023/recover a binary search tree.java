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
    ArrayList<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = f.val;
        f.val=l.val;
        l.val=temp;
        
    }
    TreeNode prev = null;
    TreeNode f = null;
    TreeNode l = null;
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prev!=null && root.val<prev.val){
            if(f==null){
                f=prev;
            }
            l=root;
        }
        else{
            prev=root;
        }
        inorder(root.right);
    }
}
