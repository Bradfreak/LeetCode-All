//Palindrome Linked List using Stack
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<Integer>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        boolean ans = true;
        temp = head;
        while(temp != null){
            if(temp.val != st.pop()){
                ans = false;
                break;
            }
            temp = temp.next;
        }
        return ans;
    }
}
