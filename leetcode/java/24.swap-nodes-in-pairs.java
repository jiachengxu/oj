/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode results = new ListNode(0);
    results.next = head;
    ListNode current = results;
    while (current.next != null && current.next.next != null) {
      ListNode first = current.next;
      ListNode second = current.next.next;
      first.next = second.next;
      current.next = second;
      current.next.next = first;
      current = current.next.next;
    }
    return results.next;
  }
}