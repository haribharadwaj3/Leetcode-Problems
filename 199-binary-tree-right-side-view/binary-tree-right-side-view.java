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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        ans(arr,0,root);
        return arr;
    }
    public void ans(List<Integer> arr,int level,TreeNode root){
        if(root==null)return;
        if(level==arr.size())arr.add(root.val);
        ans(arr,level+1,root.right);
        ans(arr,level+1,root.left);
    }
}