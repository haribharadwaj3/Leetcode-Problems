/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        if(root==null)return arr;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                list.add(node.val);
                for(Node temp:node.children){
                    q.add(temp);
                }
            }
            arr.add(list);
        }
        return arr;
    }
}