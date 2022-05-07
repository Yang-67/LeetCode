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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        int num1,num2;
        ListNode head = null;
        ListNode tail = null;
        while(l1 != null||l2 != null){
            num1 = l1!=null ? l1.val:0;
            num2 = l2!=null ? l2.val:0;
            sum = (num1 + num2 + carry)%10;
            carry = (num1 + num2 + carry)/10;
            if(head == null){
                head = tail = new ListNode(sum);
            }else {
                tail.next = new ListNode(sum);
                tail = tail.next;
            }
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
    }
    if(carry == 1) tail.next = new ListNode(1);
    return head;
    }
}