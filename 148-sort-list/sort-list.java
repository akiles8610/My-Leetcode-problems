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
    public ListNode sortList(ListNode head) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int[] arr=new int[len];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        ListNode head2=null;
        if(arr.length>0){
        head2=new ListNode(arr[0]);
        ListNode temp2=head2;
        for(int j=1;j<arr.length;j++){
            temp2.next=new ListNode(arr[j]);
            temp2=temp2.next;
            }
        }
        return head2;


        
      





    }
}