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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head,fast=head;
        ListNode i=head,j=head;
        for(int m=1;m<k;m++){
            fast=fast.next;
        }
        i=fast;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        j=slow;
        int temp=i.val;
        i.val=j.val;
        j.val=temp;
        return head;

    }
}