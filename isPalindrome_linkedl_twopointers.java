//Palindrome Linked List using Two Pointers
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
    public ListNode reverse(ListNode temp){
        ListNode rev = null;
        while(temp != null){
            ListNode n = temp.next;
            temp.next = rev;
            rev = temp;
            temp = n;
        }
        return rev;
    }
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode slow = head;
        while(slow != null){
            slow = slow.next;
            len++;
        }
        slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        len = len >> 1;
        
        while(len > 0){
            if(head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
            len--;
        }
        return true;
    }
}

