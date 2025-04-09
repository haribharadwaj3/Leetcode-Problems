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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        PriorityQueue<Long> pq=new PriorityQueue<>();
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            pq.offer(sum);
            if(pq.size()>k)pq.poll();
        }
        if(pq.size()==k){
            return pq.peek();
        }else{
            return -1;
        }  
    }
}