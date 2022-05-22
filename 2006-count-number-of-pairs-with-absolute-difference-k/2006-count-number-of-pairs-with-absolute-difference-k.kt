class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
 
    var cnt:Int=0
    for(i in 0..nums.size-1){
        for(j in 0..nums.size-1){
            if(i!=j&&Math.abs((nums[i]-nums[j]))==k){
                cnt++
            }
        }
    }
    return cnt/2
    }
}