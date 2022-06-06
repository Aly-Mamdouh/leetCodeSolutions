/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
         val set = mutableSetOf<ListNode>()
        var pA = headA
        var pB = headB
        
        while(pA != null) {
            set.add(pA)
            pA = pA.next
        }
        
        while(pB != null) {
            if(set.contains(pB)) return pB
            pB = pB.next
        }
        
        return null
    }
}