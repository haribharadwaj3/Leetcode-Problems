/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);
        for(ListNode i:lists){
            if(i!=null)
            pq.add(i);
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(!pq.isEmpty()){
            ListNode min=pq.poll();
            curr.next=min;
            curr=curr.next;
            if(min.next!=null){
                pq.add(min.next);
            }
        }
        return dummy.next;
    }
}