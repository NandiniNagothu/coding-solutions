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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = inorder(nums, 0, nums.length-1);
        return node;
    }
    public TreeNode inorder(int[] arr, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(end+start)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=inorder(arr, start, mid-1);
        root.right=inorder(arr, mid+1, end);
        return root;
    }
}
