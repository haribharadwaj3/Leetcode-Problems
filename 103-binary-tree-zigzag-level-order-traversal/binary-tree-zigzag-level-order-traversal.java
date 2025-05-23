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
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)return arr;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean zig=true;
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> ll=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(zig){
                    ll.addLast(node.val);
                }else{
                    ll.addFirst(node.val);
                }
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            arr.add(ll);
            zig=!zig;
        }
        return arr;
    }
}