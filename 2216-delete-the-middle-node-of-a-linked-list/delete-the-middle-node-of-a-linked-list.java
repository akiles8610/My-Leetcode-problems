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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==1){
            return null;
        }
        if(len==2){
            head.next=null;
            return head;
 }
        int midd=(len/2);
        temp=head;
        for(int i=1;i<midd;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}