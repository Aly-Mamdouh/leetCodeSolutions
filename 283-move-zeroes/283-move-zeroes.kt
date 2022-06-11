class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
         var cnt = 0
    var j = 0
    for (i in 0 until nums.size) {
        if (nums[i] != 0) {
            cnt++
            nums[j++] = nums[i]
        }
    }
    var ze = nums.size - j
    while (ze > 0) {
        nums[j] = 0
        j++
        ze--
    }
        
    }
}