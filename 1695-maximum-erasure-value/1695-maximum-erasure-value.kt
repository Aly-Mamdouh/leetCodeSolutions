class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var l = 0
    var r = 0
    var sum = 0
    var mx = -1
    var freq=Array<Short>(10001){0}
    while (r < nums.size) {
        freq[nums[r]]++
        sum += nums[r]
        while(freq[nums[r]]>1){
            freq[nums[l]]--
            sum-=nums[l++]
        }
        mx=Math.max(mx, sum)
        r++
    }
    return mx
    }
}