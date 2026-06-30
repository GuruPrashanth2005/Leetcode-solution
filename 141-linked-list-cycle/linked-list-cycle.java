/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp  =head;
        Map<ListNode, Boolean> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp, true);
            temp = temp.next;
        }
        return false;
    }
}