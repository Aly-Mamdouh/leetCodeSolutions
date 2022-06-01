class Solution {
    fun runningSum(nums: IntArray): IntArray {
    val pre = IntArray(nums.size) { 0 }
    val n: Int = nums.size

    pre[0] = nums[0]

    for (i in 1..n-1) {
        pre[i] = pre[i - 1] + nums[i]
    }

    return pre
    }
}