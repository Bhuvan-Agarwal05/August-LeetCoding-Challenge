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
    public int getDecimalValue(ListNode head) {
        /*  This Takes 2 ms time
        StringBuffer sp = new StringBuffer("");
        ListNode temp = head;
        while(temp!=null)
        {
            sp.append(temp.val);
            temp = temp.next;
        }
        
        return Integer.parseInt(sp.toString(),2); 
        */
        
        
        // This takes 0 ms time
        int val = 0;
        while(head!=null)
        {
            val = (2*val)+head.val;
            head = head.next;
        }
        return val;
    }
}