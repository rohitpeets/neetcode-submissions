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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode current=head;
        Stack<ListNode> bank=new Stack<>();
        while(current!=null){
            bank.push(current);
            current=current.next;
            }
        ListNode newHead=bank.pop();
        ListNode temp=newHead;
        while(!bank.isEmpty()){
            temp.next=bank.pop();
            temp=temp.next;
        }
        temp.next=null;
        return newHead;

    }
}
