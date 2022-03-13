/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        int[] a = new int[len];
        node = head;
        for(int i=len-1;i>=0;i--){
            a[i] = node.val;
            node = node.next;
        }
        return a;
    }
}
/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */