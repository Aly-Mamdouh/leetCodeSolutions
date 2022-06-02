class Solution {
    fun maxSubArray(nums: IntArray): Int {
     
	for(i in 1 until nums.size)
		nums[i] = maxOf(nums[i], nums[i] + nums[i - 1])
	return nums.max() ?: 0

    }
}