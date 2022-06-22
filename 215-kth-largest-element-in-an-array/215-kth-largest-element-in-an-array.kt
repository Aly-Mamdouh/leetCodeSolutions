class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        nums.sort()
    nums.reverse()
    var n=nums[k-1]
   return n
    }
}