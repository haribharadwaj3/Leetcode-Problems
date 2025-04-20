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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<TreeNode> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                arr.add(node);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            if(level%2!=0){
                int i=0,j=arr.size()-1;
                while(i<j){
                    int temp=arr.get(i).val;
                    arr.get(i).val=arr.get(j).val;
                    arr.get(j).val=temp;
                    i++;
                    j--;
                }
            }
            level++;
        }
        return root;
    }
}