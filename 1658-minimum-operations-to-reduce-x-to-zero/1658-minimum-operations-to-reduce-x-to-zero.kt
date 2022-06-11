class Solution {
    fun minOperations(nums: IntArray, x: Int): Int {
    var target: Int = nums.sum() - x
    if (target == 0) {
        return nums.size
    }
    var l = 0
    var sum = 0
    var res = Int.MAX_VALUE
    for (i in 0 until nums.size) {
        sum += nums[i]
        while (l < i && sum > target) {
            sum -= nums[l]
            l++
        }
        if (sum == target) {
            res = Math.min(res, nums.size - (i - l + 1))
        }
    }
    if (res == Int.MAX_VALUE) {
        return -1
    } else {
        return res
    }
    }
}