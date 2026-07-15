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
    public void reorderList(ListNode head) {

        Stack<ListNode> st= new Stack<>();

        ListNode it = head;
        while(it!=null)
        {
            st.push(it);
            it=it.next;
        }
        ListNode curr = head;
        ListNode next = head;
        int len = st.size()/2;
        for(int i=0;i<len;i++)
        {     System.out.println(i);
            next=curr.next;
            curr.next= st.peek();
            st.peek().next = next;
            st.pop();
            curr=next;
            
        }
        curr.next=null;
        
    }
}
