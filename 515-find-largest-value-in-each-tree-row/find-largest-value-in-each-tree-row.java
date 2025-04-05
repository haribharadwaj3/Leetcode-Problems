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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null)return arr;
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                max=Math.max(max,node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            arr.add(max);
        }
        return arr;
    }
}